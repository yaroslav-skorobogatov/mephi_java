package pckg;

public class ObjComp {
    public static void main(String[] args) {
        ObjComp oc = new ObjComp();
        Object o = oc;
        System.out.println(oc == o);
    }
}
