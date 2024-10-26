package pckg.lesson5.abstract_class;

public class Main {
    public static void main(String[] args) {
        //var myClass = new MyAbstractClass(); //так не получится, тк он абстрактный
        var car = new Car();


        var child = new Child();
        child.staticMeth(); //так можно, но не нужно
        Child.staticMeth(); //так нужно

        //car.staticInterfaceMethod(); а так нельзя, тк статический метод интерфейса
        TransportInterface.staticInterfaceMethod(); //так можно

    }
}
