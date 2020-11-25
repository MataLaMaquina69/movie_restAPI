package com.mata.catalogo.Catalogo.Service;

import com.mata.catalogo.Catalogo.Entity.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
     public List<Movie> searchMovie(){
         List<Movie> desta = new ArrayList<>();

         Movie movie = new Movie();
         movie.setName("Bob Esponja");
         movie.setDescription("Si vive una piña de bajo del mar");
         movie.setImgUrl("https://images-na.ssl-images-amazon.com/images/I/91VMURZ9jSL.jpg");
         desta.add(movie);
         movie = new Movie();
         movie.setName("Patricio");
         movie.setDescription("Si vive una piña de bajo del mar");
         movie.setImgUrl("https://images-na.ssl-images-amazon.com/images/I/91VMURZ9jSL.jpg");
         desta.add(movie);
         return desta;


     }

}
