package pckg.lesson5.init_block;

public class InitBlockClass {
    private int a;
    private String b;

    //блоки инициализации, принято писать между полями и методами
    //есть статические и динамические блоки инициализации
    {//запускается следующий блок перед созданием объекта
        System.out.println("from dynamic block"); //динамический блок (относится к объекту)
    }

    static { //отработает только 1 раз во время загрузки класса в память
        System.out.println("from static block"); //статический блок (относится к классу)
    }
    public InitBlockClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public InitBlockClass() {
    }

    public void method() {
        System.out.println("from dynamic method");
    }

    public static void staticMethod() {
        System.out.println("from static method");
    }
}
