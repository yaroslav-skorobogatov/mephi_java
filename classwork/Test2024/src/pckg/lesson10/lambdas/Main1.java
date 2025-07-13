package pckg.lesson10.lambdas;

import pckg.lesson9.collection.User;

import java.util.*;
import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("123");
        strList.add("1234");
        strList.add("12345");
        strList.add("123456");
        strList.add("1234567");

        System.out.println("initial list = " + strList);
        System.out.println("processed list = " + filter(strList, (elem) -> elem.length() <= 5));

        Set<User> userSet = new HashSet<>();

        var user1 = new User(1,10,"a"); // 1 -> 35 % 16 = 3 (как мапа выбирает куда положить элемент)(вообще работает побитовый сдвиг)
        var user2 = new User(2,25,"b"); // 2 -> 51 % 16 = 3 (когда получается однео число у другого ключа, тогда сравнивают между собой хэшкоды и если они разные то он внутри себя генерирует односвязный список с next)
        var user3 = new User(3,17,"c"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается
        var user4 = new User(4,36,"esa"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);

        System.out.println("initial list = " + userSet);
        System.out.println("processed list = " + filter(userSet, (elem) -> elem.getAge() >= 18));

    }

    public static <T> List<T> filter(Collection<T> collection, Function<T, Boolean> predicate) {
        List<T> resultList = new ArrayList<>();


        for (T el : collection){
            if(predicate.apply(el)) {
                resultList.add(el);
            }
        }

        return resultList;
    }
}
