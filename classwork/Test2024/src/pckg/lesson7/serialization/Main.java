package pckg.lesson7.serialization;

import java.io.*;
import java.nio.file.Path;

//todo надо посмотреть вторую 9 занятия
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //базовые структуры на языке java, позволяющие работать с потоками байт
        //InputStream;
        //OutputStream;

        //лучше использовать c пакетом java.nio, тк java.io более старый
        Path path = Path.of("resources", "users.out");
//        writeObj(path);
        readObj(path);


        User user = new User(1, "");
        user.clone();

    }

    public static void writeObj(Path path) throws IOException {
        var bob = new User(22,"Bob");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            objectOutputStream.writeObject(bob); //AutoCloseable
        }
    }

    public static void readObj(Path path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()));
        var obj = objectInputStream.readObject();

        System.out.println(obj);
    }

}

// Reflection API - мощное апи, для получения данных обьекта в runtime, можно изменять поля обьектов, можно получать доступ к static
