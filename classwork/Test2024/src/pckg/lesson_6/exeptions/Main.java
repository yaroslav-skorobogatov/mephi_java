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

//        try {
//            someMethod3();
//        } catch (RuntimeException | CustomException e) {
//            System.out.println(e.toString());
//        }  catch (Exception e) {
//            System.out.println("...");
//        }

        //someMethod2();

        //someMethod4();

        var resource = new MyResourse();

        //до 7 версии java (не рекомендуется)
//        try {
//            throw new CustomException2("Some custom exception");
//        } finally {
//            try {
//                resource.close();
//            } catch (Exception e) {
//
//            }
//        }

        var trueResouce = new TrueResource();
        var trueResouce1 = new TrueResource();
        //так не теряем основное исключение и не теряем второе исключение, но подавляем второе исключение и подвязываем к основному исключению
        //после 7 версии java (рекомендуется) (неявный вызов finally{trueResouce.close() перед вызовом catch})
        try (trueResouce; trueResouce1) {
            throw new CustomException2("Some custom exception");
        } catch (Exception e) {
            e.getSuppressed(); //получаем массив модавленных исключений
            e.printStackTrace();
        } finally {

        }
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

    public static void someMethod4() throws CustomException {
        int i = 0;
        try {
            i ++;
//            System.out.println(1/0);
            throw new CustomException();
        } catch (CustomException e) {
            i ++;
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            i ++;
            System.out.println("Some code after try-catch");
            System.out.println("i = " + i);
        }
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