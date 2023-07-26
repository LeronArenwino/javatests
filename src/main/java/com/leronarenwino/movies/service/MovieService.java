package com.leronarenwino.movies.service;

import com.leronarenwino.movies.data.MovieRepository;
import com.leronarenwino.movies.model.Genre;
import com.leronarenwino.movies.model.Movie;

import java.util.Collection;

public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre)
                .toList();
    }

    public Collection<Movie> findMoviesByLength(int length) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length)
                .toList();
    }
}
