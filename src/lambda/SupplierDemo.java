package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<List<Integer>> getRandomList = () -> {
            List<Integer> newList = new ArrayList<>(
                    List.of(
                            10, 43, 64, 54
                    )
            );
            return newList;
        };

        List<Integer> mylist = getRandomList.get();
        mylist.forEach(t -> System.out.print(t + " "));


        Supplier<Integer> getRandomNumber = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };

        System.out.println();
        System.out.println("random number is " + getRandomNumber.get());

    }
}
