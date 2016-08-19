package com.shows.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ShowsController {

    @RequestMapping("/all")
    public List<String> getShows() {
        return Arrays.asList("The big bang theory", "True detective");
    }
}
