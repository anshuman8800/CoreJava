package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> checkPositive = (t) -> {
            if(t > 0) return true;
            return false;
        };

        List<Integer> myList = new ArrayList<>(
                List.of(
                        10, 5, -1, 0, 11, -20
                )
        );

        myList.forEach(
                (t) -> System.out.println("for the number " + t + " result is " + checkPositive.test(t))
        );


        Predicate<Integer> checkEven = (t) -> {
            if(t % 2 == 0)
                return true;
            return false;
        };

        System.out.println("16 is even ? " + checkEven.test(16));
    }
}
