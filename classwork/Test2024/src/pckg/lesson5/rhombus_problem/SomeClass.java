package pckg.lesson5.rhombus_problem;

public class SomeClass implements B, C {

    //как справить с ромбовидным наследованием
    @Override
    public void someDefMeth() {
        C.super.someDefMeth();
    }
}
