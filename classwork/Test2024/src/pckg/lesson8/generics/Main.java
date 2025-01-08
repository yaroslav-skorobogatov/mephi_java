package pckg.lesson8.generics;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var user1 = new User1();
        var user2 = new User2();

        user1.printAndReturnValue(1);
        user2.printAndReturnValue("text");

        GenericUser<Integer> genericUser1 = new GenericUser<>();
        genericUser1.printAndReturnValue(1);

        GenericUser<String> genericUser2 = new GenericUser<>();
        genericUser2.printAndReturnValue("text");

        Optional<String> stringOptional = Optional.of("some text");
        Optional<Integer> integerOptional = Optional.of(255);
        Optional<User1> userOptional = Optional.of(new User1());

        var str = stringOptional.get();
        var integer = integerOptional.get();

    }

}
