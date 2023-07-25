package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BasicLambda {
    public static void main(String[] args) {
        Consumer printText = (str) -> System.out.println("str is " + str);
        Runnable myRunnable = () -> System.out.println("Runnable is running");

        printText.accept("Basic lambda");
        myRunnable.run();

        Consumer<Integer> printTable = (t) -> {
            System.out.println("printing table for " + t);
            for(int i=1; i<=10; i++) {
                System.out.println(t + " x " + i + " = " + (t*i));
            }
        };

        printTable.accept(5);
        printTable.accept(11);

        List<Integer> myList = new ArrayList<>(
                List.of(
                        10, 13, 15, 19, 6, 5
                )
        );
        myList.forEach(printText);
        myList.forEach(printTable);
    }
}
