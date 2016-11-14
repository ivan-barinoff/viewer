package com.comments.controller;

import com.comments.model.Comment;
import com.comments.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.*;

import static java.util.Collections.*;

@RestController
public class CommentsController {

    private final Logger LOG = LoggerFactory.getLogger(CommentsController.class);

    private Map<String, List<Comment>> comments = new HashMap<>();

    @PostConstruct
    public void init() {
        comments.put("The big short", Arrays.asList(new Comment("Nice movie", new User("Bob", 18)),
                                                    new Comment("Great!", new User("Alan", 22)))
        );
    }

    @RequestMapping("/{name}")
    public List<Comment> getCommentsByName(@PathVariable String name) {
        LOG.error("name = {}", name);
        return comments.containsKey(name) ? comments.get(name) : emptyList();
    }
}
