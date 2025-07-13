package pckg.lesson5.rhombus_problem;

public interface C extends A{
    default void someDefMeth() {
        System.out.println("Default from C");
    }
}

