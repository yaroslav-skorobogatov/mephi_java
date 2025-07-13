package pckg.lesson6.exсeptions;

public class MyResourse {
    public void close() throws CustomException1 {
        System.out.println("Closing resouce ...");
        throw new CustomException1("Exception when closing resouce");
    }
}
