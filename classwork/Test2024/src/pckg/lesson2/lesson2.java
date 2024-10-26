package pckg.lesson2;

import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("some text....");
        int[] numbers = new int[5];
        //int i;

        System.out.println(Arrays.toString(numbers));

        /** управляющие конструкции**/
        // тернарный оператор (синтаксический сахар - if else)
        boolean flag = false;
        String str = flag ? "first" : "second";

        //оператор swich-case
        int digit = 5;
        switch (digit) {
            case 0: System.out.println("0"); break;
            case 5: System.out.println("5"); break;
            default: System.out.println("None"); break;
        };

        /** циклы**/
        //while
        boolean isTrue = true;
        while(isTrue) {
            isTrue = false;
        };
        //do while
        do {
            isTrue = false;
        } while(isTrue);
        //for
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //бесконечный цикл - for(;;)
        //for(String arg: arg)
    }
}
//cmd + o поиск класса по названи