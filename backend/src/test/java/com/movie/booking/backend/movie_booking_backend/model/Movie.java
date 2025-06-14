package com.movie.booking.backend.movie_booking_backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder


public class Movie {
    private String Title;
    private  String Language;
    private String Genre;
}
