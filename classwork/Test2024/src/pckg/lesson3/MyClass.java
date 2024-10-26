package pckg.lesson3;

//в java, 1 файл один публичный класс
//public, private, protected, default(package private) - модификаторы доступа
//private -> default -> protected -> public
public class MyClass { //CamelCase
    private int age;
    private String name;

    //без указания по умолчанию внутри текущего пакета default(package private)
    void method2(){

    }

    //доступ для наследников и для текущего пакета
    protected void method3(){

    }

    public void method() {
        age++;
        System.out.println("....");
    }
}

//