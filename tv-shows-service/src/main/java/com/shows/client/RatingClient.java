package com.shows.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "rating-service")
public interface RatingClient {

    @RequestMapping("/{name}")
    Integer getRatingByName(@PathVariable(value = "name") String name);
}
