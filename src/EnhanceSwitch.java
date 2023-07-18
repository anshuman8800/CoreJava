public class EnhanceSwitch {
    private static void goToTraditionalSwitch(int input) {
        switch (input) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("> than 5");
                break;
        }
    }

    // This feature was introduce in java13
    private static void goToEnhanceSwitch(int input) {
        switch (input) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> {
                System.out.println("this is case 4");
                System.out.println("four");
            }
            case 5 -> System.out.println("five");
            default -> System.out.println("this is default");
        }

    }

    public static void main(String[] args) {
        goToTraditionalSwitch(3);
        goToEnhanceSwitch(4);

    }
}
