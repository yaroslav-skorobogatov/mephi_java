package pckg.lesson10.lambdas;

import pckg.lesson9.collection.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Main {
    private static int field;
    public static void main(String[] args) {
        //функциолнальный интерфей  с это интерфейс толоько с 1 методом
        //java.util.functions

        Comparator<Integer> comparator1 = new IntegerComparator();

        System.out.println(comparator1.compare(100,85));

        //анонимнывй класс
        Comparator<Integer> comparator2 = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        System.out.println(comparator2.compare(100,85));


        //lambda
        Comparator<Integer> comparator3 = (o1, o2) -> Integer.compare(o1, o2);

        System.out.println(comparator3.compare(100,85));

        //ссылка на метод
        Comparator<Integer> comparator4 = Integer::compare;  //ссылка на статич метод

        System.out.println(comparator4.compare(100,85));

        System.out.println("------------------------");

        IntUnaryOperator intUnaryOperator = x -> x * x;

        System.out.println(intUnaryOperator.applyAsInt(16));

        System.out.println("------------------------");

        Consumer<Object> consumer = System.out::println; //ссылка на нестатич метод

        consumer.accept("text");
        consumer.accept(new User(1,20,"cx"));

        System.out.println("------------------------");

        IntFunction<String[]> arrCreator = String[]::new; //ссылка на конструктор
        System.out.println(Arrays.toString(arrCreator.apply(5)));


    }

    public static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }

    public static void someStasticMethod() {
        int methosVariable = 1;
        methosVariable++;

        IntUnaryOperator intUnaryOperator = x -> {
            x = x + field;
            field++;

//            x = x + methosVariable;
//            methosVariable++; //так нельзя в лямда выражениях(переменная ведет себя как final)
//            x = x + methosVariable.get();
//            methosVariable.getAndIncrement(); //можно конвертнуть в атомик
//            x = x + methosVariable[0];
//            methosVariable[0]++; //или в массив тк он элементы не могут быть final

            return x;
        };
    }
}
