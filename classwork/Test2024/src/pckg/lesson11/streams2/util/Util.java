package pckg.lesson11.streams2.util;

import pckg.lesson11.streams2.Movie;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Movie> getMovieList() {
        List<Movie> movies = new ArrayList<>();


        movies.add(Movie.builder()
                .title("The Silence of the Lambs")
                .genre("horror")
                .duration(120)
                .build());

        movies.add(Movie.builder()
                .title("Pulp Fiction")
                .genre("crime")
                .duration(150)
                .build());

        movies.add(Movie.builder()
                .title("Psyho")
                .genre("horror")
                .duration(150)
                .build());

        movies.add(Movie.builder()
                .title("Home alone")
                .genre("comedy")
                .duration(110)
                .build());

        return movies;
    }
}
