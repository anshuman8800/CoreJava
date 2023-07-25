package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

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

        System.out.println("_____________");

        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659});

        BiConsumer<Double, Double> p1 = (value1, value2) -> {
            System.out.println(value1 + " and " + value2);
        };

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);
        System.out.println("-----------");

        coords.forEach(t -> {
            p1.accept(t[0], t[1]);
        });


        System.out.println("---------");
        coords.forEach(t -> {
            processPoint(t[0], t[1], p1);
        });
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("result is " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }
}
