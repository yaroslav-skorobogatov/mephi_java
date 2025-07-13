package pckg.lesson11.streams2;

import pckg.lesson11.streams2.util.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsComparator {
    public static void main(String[] args) {
        Util.getMovieList().stream()
                .sorted(Comparator.comparing(Movie::getDuration))
                .forEach(System.out::println);
    }
}


