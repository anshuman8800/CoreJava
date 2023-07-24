package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + "_" + lastName;
        }

        public static void main(String[] args) {
            List<Person> people = new ArrayList<>(
                    Arrays.asList(
                            new Person("Anshuman", "Kumar"),
                            new Person("Satwik", "Kumar"),
                            new Person("Anmol", "Singh"),
                            new Person("Rakesh", "Anna")
                    )
            );

            // using Anonymous Class
//            var comparatorLastName = new Comparator<Person>() {
//
//                @Override
//                public int compare(Person o1, Person o2) {
//                    return o1.lastName.compareTo(o2.lastName);
//                }
//            };
//
//            people.sort(comparatorLastName);

            // using lambda expression
            people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
            System.out.println(people);
        }
    }
}
