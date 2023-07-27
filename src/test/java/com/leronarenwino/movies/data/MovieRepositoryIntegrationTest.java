package com.leronarenwino.movies.data;

import com.leronarenwino.movies.model.Genre;
import com.leronarenwino.movies.model.Movie;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieRepositoryIntegrationTest {

    private MovieRepositoryJdbc movieRepository;
    private DriverManagerDataSource dataSource;

    @BeforeEach
    void setUp() throws SQLException {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @AfterEach
    void tearDown() throws SQLException {

        final Statement statement = dataSource.getConnection().createStatement();
        statement.execute("DROP ALL objects DELETE files");

    }

    @Test
    void load_all_movies() {

        Collection<Movie> movies = movieRepository.findAll();

        assertEquals(movies, Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        ));
    }

    @Test
    void insert_a_movie() {

        Movie movie = new Movie("Super 8", 112, Genre.THRILLER);

        movieRepository.saveOrUpdate(movie);

        Movie movieFromDb = movieRepository.findById(4);

        assertEquals(movieFromDb, new Movie(4, "Super 8", 112, Genre.THRILLER));

    }

    @Test
    void load_movie_by_id() {
        Movie movie = movieRepository.findById(2);
        assertEquals(movie, new Movie(2, "Memento", 113, Genre.THRILLER));
    }

}