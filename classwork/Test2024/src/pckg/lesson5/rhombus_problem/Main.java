package pckg.lesson5.rhombus_problem;

public class Main {
    public static void main(String[] args) {
        //полиморфизм, тк как SomeClass наследуется от интерфейса
        //нужно стараться всегда задать общий тип, чтобы можно можно было перейти на другую реализацию этого типа
        B someObj = new SomeClass();
        someObj.someDefMeth();
        A.someStaticMeth();
    }
}

// в java такого не может быть:
//              class A
//             /       \
//       class B       class C
//             \       /
//              class D
//
// но может быть:
//            interface A
//             /       \
//   interface B       interface C
//             \       /
//              class D