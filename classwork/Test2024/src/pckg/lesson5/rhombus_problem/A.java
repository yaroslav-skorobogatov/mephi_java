package pckg.lesson5.rhombus_problem;

public interface A {
    static void someStaticMeth() {
        System.out.println("From from A");
    }
    default void someDefMeth() {
        System.out.println("Default from A");
    }
}
