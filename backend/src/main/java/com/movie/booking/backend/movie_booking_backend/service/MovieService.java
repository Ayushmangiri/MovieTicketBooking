package com.movie.booking.backend.movie_booking_backend.service;

import com.movie.booking.backend.movie_booking_backend.model.Movie;
import com.movie.booking.backend.movie_booking_backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();

    }
}
