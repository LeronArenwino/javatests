package com.leronarenwino.movies.service;

import com.leronarenwino.movies.data.MovieRepository;
import com.leronarenwino.movies.model.Genre;
import com.leronarenwino.movies.model.Movie;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void return_movies_by_genre() {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );

        MovieService movieService = new MovieService(movieRepository);
        List<Integer> movies = movieService.findMoviesByGenre(Genre.COMEDY)
                        .stream().map(Movie::getId)
                        .toList();
        assertEquals(movies, Arrays.asList(3, 6));
    }
}