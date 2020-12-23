package com.mata.catalogo.Catalogo.Repository;

//Repositories are classes that interact with the db. They

import com.mata.catalogo.Catalogo.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//jpa methods findAll, findBId, save, delete
public interface MovieRepository extends JpaRepository<Movie,Integer> {

    //@Query(value="select * from Movie  order by name", nativeQuery = true) it means instead of using pql youll be using sql native
    //Query is used to personalize the consult. It consults directly the instances instead the tables
    @Query(" from Movie v order by v.name" )
    List<Movie> searchAll();

    @Query("from Movie v where v.director.id = ?1 order by v.name")
    List<Movie> searchByDirector(int directorId);

    @Query("from Movie v where v.actor.id = ?1 order by v.name")
    List<Movie> searchByActor(int actorId);

//    @Query("from Movie where v.name like %?1%")
//    List<Movie> genertalSearch(String query);

    //this is a query method where by adding "findBy"
    List<Movie> findByNameContaining(String query);





}
