package pckg.lesson8.generics;

public class GenericUser<T> {
    private T value;

    public T printAndReturnValue(T value) {
        System.out.println(value);
        return value;
    }
}
