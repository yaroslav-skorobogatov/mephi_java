package pckg.lesson5.inner_classes;

import pckg.lesson5.abstract_class.TransportInterface;

public class InnerClass {
    private int i;

    {

    }

    static {

    }

    public InnerClass(int i) {
        this.i = i;
    }

    public void method() {

    }

    //вложеные классы юывают 4 видов:
    //обычный вложенный класс
    //статический вложенный класс
    //локальный вложенный класс
    //анонимный вложенный класс

    //обычный вложенный класс
    //тут можно обращаться к ссылке обрамляющего класса this - InnerClass
    class SimpleInnerClass {
        void innerMethod() {

        }
    }

    //статический вложенный класс
    //тут нельзя обращаться к ссылке обрамляющего класса this - InnerClass
    static class StaticInnerClass {
        void innerMethod() {
        }
    }

    public void methodCreateLocalClass() {
        //локальный вложенный класс
        class LocalClass {

        }

        //анонимный вложенный класс
        TransportInterface transportInterface = new TransportInterface() {
            public void transportInterfaceMethod() {
                System.out.println(".....");
            }
        };

        //тоже самое через lambda, можно использовать только с функциональными интерфейсами (это те где есть только один абстрактный метод)
        //анонимный вложенный класс, через lambda (рекомендованно)
        TransportInterface transportLambdaInterface = () -> System.out.println(".....");

        //это аналогично этому:
        class TransportInterfaceClass implements TransportInterface {
            @Override
            public void transportInterfaceMethod() {

            }
        }
        TransportInterface transportInterfaceClass = new TransportInterfaceClass();
        transportInterfaceClass.transportInterfaceMethod();

    }
}
