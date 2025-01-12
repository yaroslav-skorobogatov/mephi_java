package pckg.sandbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;

public class lab2 {
    public static void main(String[] args) {
//        Создать класс User, описывающий пользователя (необходимые поля: id, firstName, lastName, age, country). Создать список из некоторого количества пользователей.
//        Реализовать методы, принимающие список пользователей и позволяющие выполнить следующее:
//        1)     вывести всех пользователей, отсортированных по lastName;
//        2)     вывести всех пользователей, отсортированных по age;
//        3)     проверить, что для всех пользователей age > 7;
//        4)     вычислить средний возраст всех пользователей;
//        5)    вывести количество разных стран проживания (country) среди заданных пользователей
//
//        Указание по выполнению:
//        допускается использование аннотаций Lombok для сокращения boilerplate - кода.
//
//                Все пункты должны быть реализованы с использованием Stream API.В качестве ответа должна быть указана
//        ссылка на репозиторий в git.Обращаем внимание, что проект должен быть открытым.

        List<User> usersList = new ArrayList<>();

        usersList.add(User.builder()
                .id(1)
                .age(20)
                .country("Russia")
                .firstName("Ivan")
                .lastName("Ivanov")
                .build());

        usersList.add(User.builder()
                .id(2)
                .age(30)
                .country("Belarus")
                .firstName("Petr")
                .lastName("Petrov")
                .build());

        usersList.add(User.builder()
                .id(3)
                .age(25)
                .country("Slovakia")
                .firstName("Fedor")
                .lastName("Fedorov")
                .build());

        System.out.println("task 1: вывести всех пользователей, отсортированных по lastName");
        usersList.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .forEach(System.out::println);

        System.out.println("task 2: вывести всех пользователей, отсортированных по age");
        usersList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(System.out::println);

        System.out.println("task 3: проверить, что для всех пользователей age > 7");
        boolean already7 = usersList.stream()
                .allMatch(x -> x.getAge() > 7);

        System.out.println(already7);

        System.out.println("task 4: вычислить средний возраст всех пользователей");
        double avg = usersList.stream()
                .map(x -> x.getAge())
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(avg);

        System.out.println("task 5: вывести количество разных стран проживания (country) среди заданных пользователей");
        Map<String, Long> countryCount = usersList.stream()
                .collect(Collectors.groupingBy(User::getCountry, Collectors.counting()));

        System.out.println(countryCount);


    }
}
