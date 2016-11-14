package com.movies.controller;

import com.movies.service.MovieService;
import com.movies.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/all")
    public List<Movie> getMovies() {
        return movieService.getAllSync();
    }

    @RequestMapping("/allReactor")
    public List<Movie> getMoviesReactor() {
        return movieService.getAllReactor();
    }
}
