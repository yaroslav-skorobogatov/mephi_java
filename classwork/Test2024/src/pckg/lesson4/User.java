package pckg.lesson4;

//нет множественного наследовани, нельзя делать вот так - extends BasicUser, NewBasicUser
public class User extends BasicUser {
    public User() {
    }

    public User(int age, String name) {
        //super - объект класса родителя
        super(age, name);
    }

    public User(String name) {
        super(name);
    }

    //    protected void act() {
    //        System.out.println("Act as user");
    //    }


    //перегрузка

    public float sumMethod(float a, float b) {
        return a + b;
    }

    //область видимости сужать нельзя, только можно еще больше раскрывать
    //переопределение
    @Override
    public Child act() {
        System.out.println("Act as user");
        return null;
    }

//    public Child act() throws RuntimeException  { //может возвращать исключения
//        System.out.println("Act as user");
//        return null;
//    }

    //переопределение
//    @Override
//    protected void act() {
//        System.out.println("Act as user");
//    }

    
}
