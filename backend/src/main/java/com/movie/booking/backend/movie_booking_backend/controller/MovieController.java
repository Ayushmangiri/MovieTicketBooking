package com.movie.booking.backend.movie_booking_backend.controller;


import com.movie.booking.backend.movie_booking_backend.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/movies")
public class MovieController {
    @GetMapping

    public List<Movie> getAllMovies(){
        return  List.of(
                Movie.builder().title("Animal").language("Hindi").genre("Action").description("This move has  showing son and father relation").build(),
                Movie.builder().title("Interstellar").language("English").genre("Sci-fi").description("This movie have showing the concept of BLACK HOLE ").build(),
                Movie.builder().title("3 Idiots").language("Hindi").genre("Comedy").description("This movie showing the meaning of the friendship").build()

        );
    }


}
