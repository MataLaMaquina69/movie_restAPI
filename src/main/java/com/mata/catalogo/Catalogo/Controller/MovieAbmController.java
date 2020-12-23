package com.mata.catalogo.Catalogo.Controller;

import com.mata.catalogo.Catalogo.Entity.Movie;
import com.mata.catalogo.Catalogo.Service.ActorService;
import com.mata.catalogo.Catalogo.Service.DirectorService;
import com.mata.catalogo.Catalogo.Service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieAbmController {

    private final DirectorService directorService;
    private final MovieService movieService;
    private final ActorService actorService ;


    public MovieAbmController(DirectorService directorService, MovieService movieService, ActorService actorService) {
        this.directorService = directorService;
        this.movieService = movieService;
        this.actorService = actorService;
    }

    @RequestMapping("/movies/create")
    public String showFormCreate(Model model){
        model.addAttribute("Directors", directorService.findAll());
        model.addAttribute("Actors", actorService.findAll());
        model.addAttribute("Movie", new Movie());
        return "formMovie";
    }

    @PostMapping ("/movies/save")
    public String saveMovie(Movie movie){
        System.out.println(movie);

        return "redirect:/";

    }


}
