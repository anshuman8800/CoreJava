package lambda;

@FunctionalInterface
interface laptop {
    public void showDetails();
}
class checkLaptop implements laptop {

    @Override
    public void showDetails() {
        System.out.println("MacBook Prod");
    }
}

public class Annonymous {
    public static void main(String[] args) {
        // we can't create a obj of interface, but we implement interface and then create a obj. of class
        laptop myLaptop = new checkLaptop();
        myLaptop.showDetails();

        // before jdk8, this is annonymous class and we create a obj. of that class
        laptop newLaptop = new laptop() {
            @Override
            public void showDetails() {
                System.out.println("new MacBook Pro");
            }
        };

        newLaptop.showDetails();

        laptop myNewLaptop = () -> {
            System.out.println("yeeeh, finally this is my latest laptop");
        };

        myNewLaptop.showDetails();
    }
}
