 package pckg.lesson11.streams2;

import pckg.lesson11.streams2.util.Util;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollectors {
    public static void main(String[] args) {
        List<String> strsList = Stream.of("One", "Two", "Three", "One").collect(Collectors.toList());
        List<String> strsList1 = Stream.of("One", "Two", "Three", "One").toList();

        Set<String> strsSet = Stream.of("One", "Two", "Three", "One").collect(Collectors.toSet());

        System.out.println("strsList = " +  strsList);
        System.out.println("strsSet = " +  strsSet);

        //        static <T> Function<T, T> identity() {
//            return t -> t;
//        }
//        Map<String,Movie> moviewByGenre = Util.getMovieList().stream()
//                .collect(Collectors.toMap(Movie::getGenre, Function.identity()));
//        System.out.println("moviewByGenre = " + moviewByGenre);

        Map<String,Movie> moviewByGenre = Util.getMovieList().stream()
                .collect(Collectors.toMap(Movie::getGenre, Function.identity(), (x,y) -> x));
        System.out.println("moviewByGenre = " + moviewByGenre);

        Map<String,Movie> moviewByGenre1 = Util.getMovieList().stream()
                .collect(Collectors.toMap(Movie::getGenre, Function.identity(), (x,y) -> x, LinkedHashMap::new));
        System.out.println("moviewByGenre1 = " + moviewByGenre1);



//       Long totalDuration = Util.getMovieList().stream()
//                .collect(Collectors.summingLong(Movie::getDuration));
//        System.out.println("totalDuration = " + totalDuration);

        Long totalDuration = Util.getMovieList().stream().mapToLong(Movie::getDuration).sum();
        System.out.println("totalDuration = " + totalDuration);

       Optional<Movie> maxDurationMovie = Util.getMovieList().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Movie::getDuration)));
        maxDurationMovie.ifPresent(movie -> System.out.println("maxDurationMovie = " + movie));

        Optional<Movie> maxDurationMovie1 = Util.getMovieList().stream()
                .max(Comparator.comparing(Movie::getDuration));

    }
}
