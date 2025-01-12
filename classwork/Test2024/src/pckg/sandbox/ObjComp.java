package pckg.sandbox;

import pckg.lesson4.User;

public class ObjComp {
    public static void main(String[] args) {
        ObjComp oc = new ObjComp();
        Object o = oc;
        System.out.println(oc == o);
    }
}
