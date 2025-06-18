package com.movie.booking.backend.movie_booking_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@Builder

public class Customer {
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name ;
    private String email;
    private String phone;


}
