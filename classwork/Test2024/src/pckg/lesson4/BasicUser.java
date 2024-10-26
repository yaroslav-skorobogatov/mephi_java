package pckg.lesson4;

//в java, 1 файл один публичный класс
//public, private, protected, default(package private) - модификаторы доступа
//private -> default -> protected -> public
public class BasicUser { //CamelCase
    private int age;
    private String name;
    public static final int MAX_AGE = 140; //константа
    //static - принадлежит самому классе, а не его объектам-экземплярам
    public static void someStaticMethod(){ //static, поэтому можем обращаться через с ам класс, а не объект
        System.out.println(".....");
    }
    //static методы, поля и классы не переопределимы, работает только method hiding, так как они будут принадлежать своим классам

    //final методы, поля и классы не переопределяются сразу после инициализации

    //конструкторы
    public BasicUser(int age, String name) {
        //this - ссылка на обьект текущего класса
        this.age = age;
        this.name = name;
    }

    public BasicUser(String name) {
        this.name = name;
    }

    public BasicUser() {
    }

    public Parent act() {
        System.out.println("");
        return null;
    }

    private int method2() {
        //функция , возвращает значение, надо указывать возвращаемое значение
        return MAX_AGE;
    }

    private void method() {
        //процедура или void метод (ничего не возвращает)
        age++;
        System.out.println("....");
        return; //не обязательно return
    }

//    protected void act() {
//        System.out.println("Act as basic user");
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int sumMethod(int a, int b) {
        return a + b;
    }



} // boilerplate code

//либа Lombok - анотации вместо гетеров и сетеров  (boilerplate code)