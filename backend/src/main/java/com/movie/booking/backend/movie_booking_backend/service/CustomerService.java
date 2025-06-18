package com.movie.booking.backend.movie_booking_backend.service;

import com.movie.booking.backend.movie_booking_backend.model.Customer;
import com.movie.booking.backend.movie_booking_backend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer){
        return  customerRepository.save(customer);
    }
    public List<Customer>getAllCustomer(){
        return customerRepository.findAll();
    }
}
