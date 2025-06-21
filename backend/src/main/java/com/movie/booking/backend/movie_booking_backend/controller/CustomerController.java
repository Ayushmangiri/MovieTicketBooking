package com.movie.booking.backend.movie_booking_backend.controller;

import com.movie.booking.backend.movie_booking_backend.model.Customer;
import com.movie.booking.backend.movie_booking_backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @PostMapping
    public Customer createCustomer (@RequestBody Customer customer){
        return  customerService.saveCustomer(customer);
    }
    @GetMapping
    public List<Customer>getAllCustomer(){
        return  customerService.getAllCustomer();
    }
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return  customerService.getCustomerNyID(id);
    }
}
