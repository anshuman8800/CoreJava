public class VariableArgument {
    public static void main(String[] args) {
        printString("hi!", " how", " are", " you");
        printString("I", " am", " good");
        printString("ok");
        printString();
        printString("thank you");
    }

    public static void printString(String... images) { // variable argument should be the last argument
        for(String image : images) {
            System.out.print(image);
        }
        System.out.println();
    }
}
