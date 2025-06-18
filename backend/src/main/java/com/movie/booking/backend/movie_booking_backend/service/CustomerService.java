package com.movie.booking.backend.movie_booking_backend.service;

import com.movie.booking.backend.movie_booking_backend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
}
