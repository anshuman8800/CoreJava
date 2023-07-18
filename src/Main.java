public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            RStudent student = new RStudent(i, "temp" + i, i);
            System.out.println(student.toString());
        }
    }
}