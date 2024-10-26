package pckg.lesson4;

import java.util.Objects;

public class Parent {
//    private final int finalField = 100;
    //final методы, поля и классы не переопределяются после первой инициализации
    public final int finalField = 100;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Parent: .....";
    }


    public int getFinalField() {
        return finalField;
    }
    // fn + cmd + f12 - открывает все методы и поля открытого класса

    //контракт equals и hashcode
    //правило такое если переопределяешь один метод, то должен переопределить и другой, тк они работают в паре


    //тут переопределили, что сравниваем по содержимому
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return finalField == parent.finalField && age == parent.age && Objects.equals(name, parent.name);
    }
    //гарантировать вот эти условия
    // x.equals(x)
    // x.equals(y) y.equal(x)
    // x.equals(x) y.equal(z) z.equal(x)
    // x.equals(y)
    //
    // x.equals(null) -> false

    //метод native - означает что реализован на другом языке (с, с++)
    @Override
    public int hashCode() {
        return Objects.hash(finalField, name, age);
    }
    //механиз jni - позволяет вызывать методы написанные на других языках
    //колизия это совпадение одного и того же int значения hashCode (когда два разных обьекта имеет один хэшкод)

    //для чего чтобы увеличить производительность в equals, чтобы первым ддейсвтием проверили и если все ок вернули, тк нативные функции быстрее

}
