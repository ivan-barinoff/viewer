package com.shows.controller;

import com.shows.client.RatingClient;
import com.shows.model.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ShowsController {

    private static final List<String> SHOWS = Arrays.asList("The big bang theory", "True detective");

    @Autowired
    private RatingClient ratingClient;

    @RequestMapping("/all")
    public List<Show> getShows() {
        return SHOWS.stream()
                    .map(name -> new Show(name, ratingClient.getRatingByName(name)))
                    .collect(Collectors.toList());
    }
}
