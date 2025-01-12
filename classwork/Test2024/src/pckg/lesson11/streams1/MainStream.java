package pckg.lesson11.streams1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        List<String> listStr = List.of("1", "2", "3", "4", "5");
//
//        for (String str : listStr) {
//            Integer intValue = Integer.valueOf(str);
//            if (intValue % 2 == 0) {
//                System.out.println(intValue);
//            }
//        }
//    // Java 8
//        listStr.stream()
////                .map(x -> Integer.valueOf(x))
//                .map(Integer::valueOf)
//                .filter(x -> x % 2 == 0)
////                .forEach(x -> System.out.println(x))
//                .forEach(System.out::println);


//        listStr.stream()
//                .map(Integer::valueOf)
//                .filter(x -> x % 2 == 0)
//                .limit(1)
//                .forEach(System.out::println);

        List<String> books = List.of("B book", "B book", "C book", "A book", "D book", "C book", "C book");

//        books.stream()
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

//        books.stream()
//                .sorted()
//                .skip(2)
//                .forEach(System.out::println);

//        books.stream()
//                .distinct()
//                .forEach(System.out::println);

        Set<String> booksSet = Set.of("B book", "C book", "A book", "D book");

//        booksSet.stream()
//                .forEach(System.out::println);


        List<String> listStr1 = List.of("1", "2", "3", "4", "5", "6", "7", "8");

//        listStr1.stream()
//                .map(Integer::valueOf)
//                .peek(el -> System.out.println("From peek: " + el))
//                .filter(x -> x % 2 == 0)
//                .forEach(System.out::println);


        //Создание стримов
        Arrays.stream(new Integer[]{1, 2, 3});

        String str = "let's\ntake some\nline of\ntext";
//        str.lines()
//                .forEach(System.out::println);

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);

        var stream3 = Stream.concat(stream1, stream2);

//        stream3.forEach(System.out::println);

        Stream.empty();


        List<String> listStr2 = List.of("1", "2", "3", "4", "5", "6", "7", "8");

//        var streamSize = listStr2.stream()
//                .map(Integer::valueOf)
//                .filter(x -> x >= 2)
//                .peek(el -> System.out.println("From peek: " + el))
//                .count();

//        System.out.println("streamSize = " + streamSize);

        List<List<Integer>> list4 = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));

//        list4.stream()
////                .flatMap(el -> el.stream())
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);

        User user1 = new User("Ann", 19);
        User user2 = new User("Bob", 15);
        User user3 = new User("Alice", 29);
        User user4 = new User("ChaD", 9);


        List<User> userList = List.of(user1,user2,user3,user4);

        userList.stream()
                .filter(user -> user.getAge() <= 18)
                .forEach(System.out::println);

        List<String> listStr3 = List.of("1", "2", "3", "4", "5", "6", "7", "8");

        String str1 = listStr3.stream()
                .findFirst()
                .get();

        List<Integer> listInt = List.of(1,2,3,4,5,6);

        listInt.stream()
                .anyMatch(x -> x > 3);


    }

    @Data
    @AllArgsConstructor
    private static class User {
        private String name;
        private Integer age;
    }

}
