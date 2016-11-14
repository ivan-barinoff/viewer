package com.rating.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:ibarinov@wiley.com">Ivan Barinov</a>
 */
@RestController
public class RatingController {

    private final Logger LOG = LoggerFactory.getLogger(RatingController.class);

    private static final int NO_RATING = 0;

    private Map<String, Integer> ratings = new HashMap<>();

    @PostConstruct
    public void init() {
        ratings.put("The big short", 5);
        ratings.put("The big bang theory", 4);
    }

    @RequestMapping("/{name}")
    public Integer getRatingByName(@PathVariable String  name) {
        LOG.error("name = {}", name);
        return ratings.containsKey(name) ? ratings.get(name) : NO_RATING;
    }
}
