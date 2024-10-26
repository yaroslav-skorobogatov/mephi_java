package pckg.lesson5.init_block;

public class Child extends Parent{
    private String s;

    static {
        System.out.println("from static block child"); //динамический блок (относится к объекту)
    }

    {
        System.out.println("from dynamic block child"); //статический блок (относится к классу)
    }

    public Child(String s) {
        super("");
        System.out.println("from construct child");
        this.s = s;
    }
}
