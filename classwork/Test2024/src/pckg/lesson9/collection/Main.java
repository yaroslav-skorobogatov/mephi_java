package pckg.lesson9.collection;

import java.util.*;

public class  Main { //shift + control + R запустить
    public static void main(String[] args) {
        // ссылки не изменяфемые, а элементы изменяемы
        final Integer[] arr = {1,2,3};
//        arr = {1, 10, 3}; // так не работает
        arr[1] = 10; //так работаент
        System.out.println(Arrays.toString(arr));

        List<Integer> list = List.of(1,2,3);

        //элементы массива находятся в одной области памяти, ArrayList в основе лежит массив []
        //массивы нужно переопределять, когда растет размер (ArrayList делает это под капотом)
        List<Integer> arrList = new ArrayList<>();
        //элементы связных списки находятся в разных областях памяти, в основе лежит Node, каждый элемент имеет информацию о следующем и предыдущем элементе
        //списки не нужно переопределять, когда растет размер, так как элменты находятся в разныхразделах пкамяти
        List<Integer> lkdList = new LinkedList<>();


        arrList.add(5);
        arrList.add(3);
        arrList.add(44);
        arrList.add(2);
        arrList.add(1);
        arrList.add(1);
        arrList.add(5, 5); // O(n)
        //1,2,3,55,78
        //1,2,3,5,55,78

        arrList.get(3); //O(1)

        lkdList.add(1);
        lkdList.add(1);
        lkdList.add(1);
        lkdList.add(1);
        lkdList.add(1);

        lkdList.get(2); // O(n)


//        Collections.sort(arrList);
//        System.out.println(arrList);

        Iterator<Integer> iterator = arrList.iterator();

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //foreach (синтаксический сахар) для кода выше
        for (Integer integer : arrList) {
            System.out.println(integer);
        }

//        так нельзя так будет ошибка
//        for (Integer element : arrList) {
//            if (element > 5) {
//                arrList.remove(element);
//            }
//            System.out.println(element);
//        }
//        arrList.sort();

        //нужно делать через итераторы
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > 5) {
                iterator.remove();
            }
            System.out.println(next);
        }

        // Fail Safe / Fail Fast
        System.out.println(arrList);


        //есть интерфейс ListIterato, он более лучше сем просто iterator для List


        //размер мапы переопределяется по аналолгии с массивом
        Map<Integer, User> usersMap = new HashMap<>();

        var user1 = new User(1,20,"a"); // 1 -> 35 % 16 = 3 (как мапа выбирает куда положить элемент)(вообще работает побитовый сдвиг)
        var user2 = new User(2,25,"b"); // 2 -> 51 % 16 = 3 (когда получается однео число у другого ключа, тогда сравнивают между собой хэшкоды и если они разные то он внутри себя генерирует односвязный список с next)
        var user3 = new User(3,26,"c"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается
        //чтобы не получить O(n) из-за этих внутренних списков, есть механиз ресайса, выделяются новые места и эти элементы распределеяются по всем местам и будет уже делится не на 16 а на 32 и т.д
        //так же есть механизм,при определенных условиях если внутренние списки все равно расширяютяя, делает из внутренних списков деревья и получается внутри уже не линейная сложность а логарифмическая O(n) -> O(log n)
        usersMap.put(user1.getId(), user1);
        usersMap.put(user2.getId(), user2);
        usersMap.put(user3.getId(), user3);

        usersMap.put(user1.getId(), user3);

        System.out.println(usersMap);

        //если переопределить hashcode по дуратски (допустим поставим коэфициент)
        //дерево уже будет строится не по hashcode а по identityhashcode

        System.out.println(usersMap.get(1).getAge());
        System.out.println(usersMap.getOrDefault(200, user1 ).getAge());


        Map<Integer, User> usersLinkMap = new LinkedHashMap<>();// мапа как список (list)

        var user21 = new User(1,20,"a"); // 1 -> 35 % 16 = 3 (как мапа выбирает куда положить элемент)(вообще работает побитовый сдвиг)
        var user22 = new User(2,25,"b"); // 2 -> 51 % 16 = 3 (когда получается однео число у другого ключа, тогда сравнивают между собой хэшкоды и если они разные то он внутри себя генерирует односвязный список с next)
        var user23 = new User(3,26,"c"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается
        var user24 = new User(4,26,"d"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается

        usersLinkMap.put(user21.getId(), user21);
        usersLinkMap.put(user22.getId(), user22);
        usersLinkMap.put(user23.getId(), user23);
        usersLinkMap.put(user24.getId(), user24);

        System.out.println(usersLinkMap);

        Map<Integer, User> usersTreeMap = new TreeMap<>(); //отсортированная мапа

        var user31 = new User(1,20,"a"); // 1 -> 35 % 16 = 3 (как мапа выбирает куда положить элемент)(вообще работает побитовый сдвиг)
        var user32 = new User(2,25,"b"); // 2 -> 51 % 16 = 3 (когда получается однео число у другого ключа, тогда сравнивают между собой хэшкоды и если они разные то он внутри себя генерирует односвязный список с next)
        var user33 = new User(3,26,"c"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается
        var user34 = new User(4,26,"d"); // колизии - когда разные обьекты имеют одинаковый хэшкод. всен будет тоже самое что выше? а дальше (хэшкоды одинаковые) дальше идет сравнение по ссылкам и equals, если хоть один разный то вставляется в этот список, иначе значит обьект одинаковый и значение ключа переписывается


        usersTreeMap.put(user33.getId(), user33);
        usersTreeMap.put(user34.getId(), user34);

        usersTreeMap.put(user31.getId(), user31);
        usersTreeMap.put(user32.getId(), user32);

        System.out.println(usersTreeMap);

        Set<String> set = new HashSet<>();
        Set<String> linkSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        Collections.sort(arrList);
        System.out.println(arrList);

        UserComparator userComparator = new UserComparator();
        Set<User> usersSet = new TreeSet<>(userComparator);

        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);

//        user1.compareTo(user3);
        userComparator.compare(user1, user3);

        System.out.println(usersSet);
    }

}


//natural ordering == Comparable