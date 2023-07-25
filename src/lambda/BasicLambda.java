package lambda;

import java.util.function.Consumer;

public class BasicLambda {
    public static void main(String[] args) {
        Consumer data = (str) -> System.out.println("str is " + str);
        Runnable myRunnable = () -> System.out.println("Runnable is running");

        data.accept("Basic lambda");
        myRunnable.run();

        Consumer<Integer> printTable = (t) -> {
            System.out.println("printing table for " + t);
            for(int i=1; i<=10; i++) {
                System.out.println(t + " x " + i + " = " + (t*i));
            }
        };

        printTable.accept(5);
        printTable.accept(11);
    }
}
