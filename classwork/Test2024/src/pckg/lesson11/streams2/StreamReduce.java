package pckg.lesson11.streams2;

import pckg.lesson11.streams2.util.Util;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReduce {
    public static void main(String[] args) {
        Optional<Long> totalDuration = Util.getMovieList().stream()
                .map(Movie::getDuration)
                .reduce(Long::sum);
        System.out.println("totalDuration = " + totalDuration.get());

        Long totalDuration1 = Util.getMovieList().stream()
                .map(Movie::getDuration)
                .reduce(0L, Long::sum);
        System.out.println("totalDuration1 = " + totalDuration1);

        Optional<Long> totalDuration2 = Util.getMovieList().stream()
                .map(Movie::getDuration)
                .collect(Collectors.reducing((duration1, duration2) -> duration1 + duration2));
        System.out.println("totalDuration2 = " + totalDuration2.get());

        Long totalDuration3 = Util.getMovieList().stream()
                .map(Movie::getDuration)
                .collect(Collectors.reducing(0L, (duration1, duration2) -> duration1 + duration2));
        System.out.println("totalDuration3 = " + totalDuration3);

        Long totalDuration4 = Util.getMovieList().stream()
                .map(Movie::getDuration)
                .reduce(0L, (duration1, duration2) -> duration1 + duration2);
        System.out.println("totalDuration1 = " + totalDuration4);


    }
}
