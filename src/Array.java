public class Array {
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] anotherArray = array;

        for(int i=0; i<10; i++) {
            array[i] = i;
        }
        System.out.println("old Array is ");
        printArray(array);

        System.out.println("new array is ");
        printArray(anotherArray);

        array[0] = 10000;

        System.out.println("AFTER MODIFICATION");
        System.out.println("old Array is ");
        printArray(array);

        System.out.println("new array is ");
        printArray(anotherArray); // since, anotherArray is the reference of the 'array', so it will also modify

    }
}
