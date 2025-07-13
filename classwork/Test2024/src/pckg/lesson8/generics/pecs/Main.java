package pckg.lesson8.generics.pecs;

import pckg.lesson4.User;
import pckg.lesson8.generics.intro.CustomArray;

public class Main {
    public static void main(String[] args) {
        // P.E.C.S
        //Producer Extends, Consumer Super

        CustomArray<? extends Class2> customArray = new CustomArray<>(10);
        //Class3 class3 = customArray.get(0); // Class2 // так не работает
        Class3 class3 = (Class3) customArray.get(0); // Class2
        Class1 class1 = customArray.get(0); // Class2


//        customArray.add(new Class3()); // не работает так
//        customArray.add(new Class1()); // не работает так
        customArray.add(null);


        CustomArray<? super Class2> customArray2 = new CustomArray<>(10);
        //Class3 class3 = customArray.get(0); // Class2 // так не работает

        customArray2.add(new Class3());
//        customArray2.add(new Class1()); // не работает так


//        Class0 el1 = customArray2.get(0); // не работает так
//        Class3 el2 = customArray2.get(0); // не работает так
        Object el3 = customArray2.get(0);

    }
}
