package pckg.lesson4;

public class GrandParent {
    private GrandParent() {
    }

    //паттерн singleton - либо 1, либо 0 обьектов класса на все приложение
    public static void someStaticMethod() {
        var grandParent = new GrandParent();
    }
}
