package pckg.lesson5.abstract_class;

//ссылочный тип
//не может иметь конструктора
//нельзя сосздаваит  обьекты экземпляры //все публичное
public interface TransportInterface {
    //поля в интерфейсе являются константами
    int SIZE = 10;

    //абстракные классы в интерфейсе публичные
    //по умолчанию он еще абстрактный
    void transportInterfaceMethod();

    //логика по умолчанию, которые можно не переопределять в классах наследниках
    //удобно для расширения, чтобы не ломать, что находится в наследниках
    default void anotherTransportInterfaceMethod() {
        System.out.println("default real.");
    };


    //статические методы не доступны в объектах классов наследников
    static void staticInterfaceMethod() {
        System.out.println("default real.");
    };
}
