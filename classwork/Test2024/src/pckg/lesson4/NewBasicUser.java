package pckg.lesson4;

//в java, 1 файл один публичный класс
//public, private, protected, default(package private) - модификаторы доступа
//private -> default -> protected -> public
public class NewBasicUser { //CamelCase
    private int age;
    private String name;
    public static final int MAX_AGE = 140;

    //конструкторы
    public NewBasicUser(int age, String name) {
        //this - ссылка на обьект текущего класса
        //super - ссылка на обьект родительского класса
        this.age = age;
        this.name = name;
    }

    public NewBasicUser(String name) {
        this.name = name;
    }

    public NewBasicUser() {
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

    protected void act() {
        System.out.println("Act as basic user");
    }

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
} // boilerplate code

//либа Lombok - анотации вместо гетеров и сетеров  (boilerplate code)