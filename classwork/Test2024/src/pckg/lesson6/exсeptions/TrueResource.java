package pckg.lesson6.exсeptions;

public class TrueResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing resouce ...");
        throw new CustomException1("Exception when closing true resource");
    }
}
