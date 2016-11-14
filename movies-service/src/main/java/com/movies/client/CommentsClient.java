package com.movies.client;

import com.movies.model.Comment;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "comments-service")
public interface CommentsClient {

    @RequestMapping("/{name}")
    List<Comment> getCommentsByName(@PathVariable(value = "name") String name);
}
