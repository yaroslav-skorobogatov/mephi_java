package pckg.lesson8.generics.intro;

public class CustomArray<T> { // List
    private T[] objects;
    private int size;

    public CustomArray(int initialSize){
        objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
        // size++ = size += 1
    }

    public T get(int index) {
        return objects[index];
    }
}
