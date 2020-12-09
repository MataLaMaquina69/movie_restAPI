package com.mata.catalogo.Catalogo.Controller;

import com.mata.catalogo.Catalogo.Entity.Movie;
import com.mata.catalogo.Catalogo.Service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListController {

    private final MovieService movieService;
    public ListController(MovieService movieService) {
        this.movieService = movieService;
    }


    @RequestMapping("/")
    public String listarCatalogo(Model model){
        List<Movie> destacados = movieService.searchMovie();
        model.addAttribute("Movies", destacados);

        return "listado";
    }
    @RequestMapping("/moviesBDirector")
    public  String listMoviesByDirector(int directorId, Model model){
        List<Movie> movies = movieService.searchByDirector(directorId);
        model.addAttribute("Movies", movies);
        return "listado";

    }

    @RequestMapping("/moviesBActor")
    public  String listMoviesByActor(int actorId, Model model){
        List<Movie> movies = movieService.searchByActor(actorId);
        model.addAttribute("Movies", movies);
        return "listado";

    }


    @RequestMapping("/search")
    public  String search(@RequestParam("q") String query, Model model){
        List<Movie> movies = movieService.generalSearch(query);
        model.addAttribute("Movies", movies);
        return "listado";

    }
}
