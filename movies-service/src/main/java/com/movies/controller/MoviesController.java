package com.movies.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MoviesController {

    @RequestMapping("/all")
    public List<String> getMovies() {
        return Arrays.asList("The big short", "Tender Is the night");
    }
}
