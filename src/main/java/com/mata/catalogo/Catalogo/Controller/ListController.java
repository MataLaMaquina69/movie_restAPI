package com.mata.catalogo.Catalogo.Controller;

import com.mata.catalogo.Catalogo.Entity.Movie;
import com.mata.catalogo.Catalogo.Service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("Movies ", destacados);

        return "listado";
    }
}
