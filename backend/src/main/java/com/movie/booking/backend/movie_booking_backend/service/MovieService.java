package com.movie.booking.backend.movie_booking_backend.service;

import com.movie.booking.backend.movie_booking_backend.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MovieService {
    public List<Movie> getAllMovies() {
        return List.of(
                Movie.builder().title("Animal").language("Hindi").genre("Action").description("Father-son bonding").build(),
                Movie.builder().title("Interstellar").language("English").genre("Sci-fi").description("Black Hole Concept").build(),
                Movie.builder().title("3 Idiots").language("Hindi").genre("Comedy").description("Friendship theme").build()
        );
    }
}
