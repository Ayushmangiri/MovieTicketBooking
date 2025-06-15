package com.movie.booking.backend.movie_booking_backend.model;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder


public class Movie {
    private String title;
    private  String language;
    private String genre;
    private String description;
    private String Category;
}
