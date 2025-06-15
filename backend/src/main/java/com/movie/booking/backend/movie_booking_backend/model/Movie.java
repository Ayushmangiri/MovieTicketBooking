package com.movie.booking.backend.movie_booking_backend.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private  Long id;
    private String title;
    private  String language;
    private String genre;
    private String description;
    private String category;
}
