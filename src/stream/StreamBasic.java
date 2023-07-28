package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBasic {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(
                List.of(
                        10, 11, 12, 13, 14, 15, 9
                )
        );

        data.stream().filter(t -> t%2 != 0).map(t -> 2*t).forEach(t -> {
            System.out.println("---> value is 3 time " + t);
        });

        data.stream().forEach(t -> {
            System.out.println("element is " + t);
        });

        data.stream().sorted().forEach(t -> System.out.println("--> " + t));

        data.stream().map((t) -> 3*t).forEach((t) -> {
            System.out.println("*" + t);
        });

        String result = data.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println("result is " + result);

        long start = System.currentTimeMillis();
        IntStream.range(0, 1000).forEach(t -> System.out.println(t));
        long end = System.currentTimeMillis();
        System.out.println("time it takes " + (end-start));


        start = System.currentTimeMillis();
        IntStream.range(0, 1000).parallel().forEach(t -> System.out.println(t));
        end = System.currentTimeMillis();
        System.out.println("time it takes " + (end-start));


    }
}
