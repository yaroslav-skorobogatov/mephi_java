package pckg.lesson_6.exeptions;

public class Main {
    //throws Exception тут пробросили на уровень jvm
    public static void main(String[] args) throws Exception {
//        System.out.println(1/0);
//        System.out.println("Text after Exception");
//
//        var user = new User();
//
//        user = null;
//
//        //System.out.println(user.getName()); //java.lang.NullPointerException
//        System.out.println(user != null ? user.getName() : "user is null"); // так можно обработать
//
//        System.out.println("Text after Exception");
//

        try {
            someMethod3();
        } catch (RuntimeException | CustomException e) {
            System.out.println(e.toString());
        }  catch (Exception e) {
            System.out.println("...");
        }

        someMethod2();

    }

    //тут пробрасывать не нужно, компилятор не требует (throws Exception )
    public static void someMethod() {
        //непроверяемые исключения, компилятор на это исключение не обращает внимание
        throw new RuntimeException();
    }

    //throws Exception - пробрасывает дальше
    public static void someMethod2() throws Exception {
        //проверяемые исключения, компилятор обращает внимание на это исключение
        throw new Exception();
    }

    public static void someMethod3() throws CustomException {
        //свой Exception
        throw new CustomException();
    }
}


//        Throwable
//        /      \
//    Error     Exception
//                 \
//            RuntimeException


//Error     - ошибки уровня jvm - (их не нужно обрабатывать)
//Exception - ошибки уровня программы - (их можно обрабатывать)

//Exception - все что наследуется от Exception и сам Exception, кроме RuntimeException, проверяемые Exception
//RuntimeException - все что наследуется от RuntimeException и сам RuntimeException, непроверяемые Exception
//копилятор по разному работает с проверяемые и непроверяемые

//RuntimeException - обнаружить такое исключение можно только в момент работы програмы
//Exception - обнаружить такое исключение можно в момент написания кода