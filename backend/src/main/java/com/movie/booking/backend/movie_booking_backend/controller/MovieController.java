package com.movie.booking.backend.movie_booking_backend.controller;


import com.movie.booking.backend.movie_booking_backend.model.Movie;
import com.movie.booking.backend.movie_booking_backend.repository.MovieRepository;
import com.movie.booking.backend.movie_booking_backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
    @GetMapping
    public  List <Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
