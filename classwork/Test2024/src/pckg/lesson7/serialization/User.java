package pckg.lesson7.serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class User implements  Serializable, Cloneable { //DTO
    @Serial
    private static final long serialVersionUID = 1L;

    private int age;
    private String name;

    //более предпочтительный способ копирования
    public User(User user) {
        this.name = user.name;
        this.age = user.age;
    }

    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    //transient - исключаем из сериализации и десериализации
    //private transient String desc;


    //при  Serializable все что static, не учавствует в сериализации
    //тк сериализация это работа с обьектом
    //но можно это реализовать через Externalizable
    //implements Externalizable - наследуется от Serializable, но можно задать как мы читаем и как мы пишем
//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        //...
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        //...
//    }
}


//implements Serializable - дает возможность указать компилятору, что обьект этого класса можно сериализовать
//Serializable - маркерный интерфейс
//сейчас это делает через анотации


//обьект singleton - только 1 обьект на все приложение (при сериализации, могут получится 2 обьекта, надо об этом позаботиться самостоятельно)