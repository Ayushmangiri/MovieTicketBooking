package com.movie.booking.backend.movie_booking_backend.repository;

import com.movie.booking.backend.movie_booking_backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer,Long> {
}
