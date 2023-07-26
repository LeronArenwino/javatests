package com.leronarenwino.movies.service;

import com.leronarenwino.movies.data.MovieRepository;
import com.leronarenwino.movies.model.Genre;
import com.leronarenwino.movies.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    private MovieService movieService;

    @BeforeEach
    void setUp() {
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

        movieService = new MovieService(movieRepository);
    }

    @Test
    void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        assertEquals(getMoviesIds(movies), Arrays.asList(3, 6));
    }

    @Test
    void return_movies_by_length() {
        Collection<Movie> movies  = movieService.findMoviesByLength(119);
        assertEquals(getMoviesIds(movies), Arrays.asList(2, 3, 4, 5, 6));
    }

    private static List<Integer> getMoviesIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId)
                .toList();
    }
}