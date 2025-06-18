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

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie updateMovie) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie is not found" + id));

        movie.setTitle(updateMovie.getTitle());
        movie.setLanguage(updateMovie.getLanguage());

        movie.setGenre(updateMovie.getGenre());
        movie.setDescription(updateMovie.getDescription());
        movie.setCategory(updateMovie.getCategory());

        return movieRepository.save(movie);

    }
}