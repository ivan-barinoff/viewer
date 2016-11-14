package com.movies.service;

import com.movies.client.CommentsClient;
import com.movies.client.RatingClient;
import com.movies.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static reactor.core.publisher.Mono.just;
import static reactor.core.publisher.Mono.when;

@Service
public class MovieService {

    private static final List<String> MOVIES = Arrays.asList("The big short", "Tender Is the night");

    @Autowired
    private RatingClient ratingClient;

    @Autowired
    private CommentsClient commentsClient;

    public List<Movie> getAllSync() {
        return MOVIES.stream().map(this::findMovieSync)
                .collect(Collectors.toList());
    }

    public List<Movie> getAllReactor() {
        return MOVIES.stream().map(this::findMovieReactor)
                .collect(Collectors.toList());
    }

    public Movie findMovieReactor(String name) {
        return when(just(ratingClient.getRatingByName(name)),
                    just(commentsClient.getCommentsByName(name)))
                   .then(t -> just(new Movie(name, t.getT1(), t.getT2())))
                   .block();
    }

    public Movie findMovieSync(String name) {
        return new Movie(name,
                        ratingClient.getRatingByName(name),
                        commentsClient.getCommentsByName(name));
    }
}
