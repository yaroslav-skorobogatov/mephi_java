package pckg.lesson11.streams2.util;

import pckg.lesson11.streams2.Movie;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGrouping {
    public static void main(String[] args) {
        Map<String, List<Movie>> moviewByGenre1 = Util.getMovieList().stream()
                .collect(Collectors.groupingBy(Movie::getGenre));

        System.out.println(moviewByGenre1);
    }
}
