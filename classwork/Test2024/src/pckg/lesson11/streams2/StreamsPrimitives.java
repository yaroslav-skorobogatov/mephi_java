package pckg.lesson11.streams2;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamsPrimitives {
    public static void main(String[] args) {
        List<String> listStr = List.of("1", "2", "3", "4", "5", "6", "7");

        OptionalInt maxFromList = listStr.stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("maxFromList = " + maxFromList.getAsInt());

        OptionalDouble average = listStr.stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("average = " + average.getAsDouble());

        IntSummaryStatistics summaryStatistic = listStr.stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("summaryStatistic = " + summaryStatistic);


        listStr.stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .mapToObj(Integer::valueOf)
                .forEach(System.out::println);

        listStr.stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .boxed()
                .forEach(System.out::println);


        //создание стримов привитивов

        var intStream1 = IntStream.of(1, 2, 3);

        DoubleStream.generate(Math::random);

        IntStream.range(1,100);
        IntStream.rangeClosed(1,100);

        IntStream.iterate(10, i -> i + 5)
                .limit(15)
                .forEach(System.out::println);

    }
}
