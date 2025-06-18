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
        Movie existingMovie = movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie is not found" + id));

        existingMovie.setTitle(updateMovie.getTitle());
        existingMovie.setLanguage(updateMovie.getLanguage());

        existingMovie.setGenre(updateMovie.getGenre());
        existingMovie.setDescription(updateMovie.getDescription());
        existingMovie.setCategory(updateMovie.getCategory());

        return movieRepository.save(existingMovie);

    }
}