package com.ratings.data.microservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratings.data.microservice.models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRatings(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
}
