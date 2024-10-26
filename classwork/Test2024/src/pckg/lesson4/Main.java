package pckg.lesson4;

public class Main {
    public static void main(String[] args) {
        //ctrl d - дублирует текущую строку
        BasicUser basicUser  = new BasicUser();
        BasicUser basicUser1 = new BasicUser(5, "Mary");
        BasicUser basicUser2 = new BasicUser("Mary");

        basicUser.getAge();
        basicUser.setAge(6);

        int age = BasicUser.MAX_AGE; //обращаемся прямо через класс, а не через объект класса

        BasicUser.someStaticMethod(); //обращаемся прямо через класс, а не через объект класса

        System.out.println(basicUser);
        basicUser.act();

        var user = new User();
        user.act();

        var parent = new Parent();
        System.out.println(parent);
    }
}