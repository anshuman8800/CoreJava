package lambda;

import java.util.function.Consumer;

public class BasicLambda {
    public static void main(String[] args) {
        Consumer data = (str) -> System.out.println("str is " + str);
        Runnable myRunnable = () -> System.out.println("Runnable is running");

        data.accept("Basic lambda");
        myRunnable.run();
    }
}
