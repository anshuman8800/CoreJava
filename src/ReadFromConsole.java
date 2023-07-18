import java.util.Scanner;

public class ReadFromConsole {
    public static void usingSystemConsole() {
        String input = System.console().readLine("Hey, Tell me your name ? ");
        System.out.println("Hi !" + input);
    }

    public static void usingScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, Tell me your DOB ?");
        String input = scanner.nextLine();
        System.out.println("Your DOB is " + input);
    }
    
    public static void main(String[] args) {
        // Read the input from the console using System.console
        usingSystemConsole();
        // Read the input from the console using Scanner class
        usingScanner();
    }
}
