package com.ajuuke.movie_devops.services;

import com.ajuuke.movie_devops.models.Movie;
import com.ajuuke.movie_devops.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    // Create
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}