package com.movies.controller;

import com.movies.client.RatingClient;
import com.movies.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MoviesController {

    private static final List<String> MOVIES = Arrays.asList("The big short", "Tender Is the night");

    @Autowired
    private RatingClient ratingClient;

    @RequestMapping("/all")
    public List<Movie> getMovies() {
        return MOVIES.stream().map(movie -> new Movie(movie, ratingClient.getRatingByName(movie)))
                              .collect(Collectors.toList());
    }
}
