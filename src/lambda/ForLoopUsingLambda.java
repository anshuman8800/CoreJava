package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForLoopUsingLambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Anny", "Appy", "Mukesh", "Rishav"
        ));

        for(var name : names) {
            System.out.println(name);
        }

        System.out.println("_______");

        names.forEach((s -> System.out.println(s)));

        System.out.println("_______");

        names.forEach((s) -> {
            char firstLetter = s.charAt(0);
            System.out.println(s + " with " + firstLetter);
        });
        int result = calculator((a, b) -> a+b, 5,6);

        System.out.println("5 + 6 = " + result);
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println("result is " + result);
        return result;
    }
}
