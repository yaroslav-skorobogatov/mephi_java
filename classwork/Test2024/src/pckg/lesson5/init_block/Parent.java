package pckg.lesson5.init_block;

public class Parent {
    private String s;

    static {
        System.out.println("from static block parent"); //динамический блок (относится к объекту)
    }

    {
        System.out.println("from dynamic block parent"); //статический блок (относится к классу)
    }

    public Parent(String s) {
        System.out.println("from construct parent");
        this.s = s;
    }
}
