package com.movie.booking.backend.movie_booking_backend.repository;

import com.movie.booking.backend.movie_booking_backend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
