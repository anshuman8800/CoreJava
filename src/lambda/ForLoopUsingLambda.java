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
    }
}
