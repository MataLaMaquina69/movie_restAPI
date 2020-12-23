package com.mata.catalogo.Catalogo.Service;

import com.mata.catalogo.Catalogo.Entity.Movie;
import com.mata.catalogo.Catalogo.Repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

     public List<Movie> searchMovie(){
         return movieRepository.searchAll();

     }
     public List<Movie> searchByDirector(int directorId){
        return movieRepository.searchByDirector(directorId);
     }


    public List<Movie> searchByActor(int actorId){
        return movieRepository.searchByActor(actorId);
    }

    public List<Movie> generalSearch(String query){
        return movieRepository.findByNameContaining(query);
    }

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }

}
