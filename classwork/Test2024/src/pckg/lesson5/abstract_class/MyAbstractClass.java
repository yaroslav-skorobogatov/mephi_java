package pckg.lesson5.abstract_class;

//нельзя создавать обьекты абстрактного класса
public abstract class MyAbstractClass {
    private int age;

    public abstract void method();

    public MyAbstractClass(int age) {
        this.age = age;
    }
}
