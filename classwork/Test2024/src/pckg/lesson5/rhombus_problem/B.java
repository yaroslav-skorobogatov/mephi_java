package pckg.lesson5.rhombus_problem;

public interface B extends A {
    default void someDefMeth() {
        System.out.println("Default from B");
    }
}
