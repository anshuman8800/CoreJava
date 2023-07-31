package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread newThread = new BasicThread();
        newThread.start();

        MyRunnable newMyRunnable = new MyRunnable();
        Thread newThreadFromRunnableClass = new Thread(newMyRunnable);
        newThreadFromRunnableClass.start();
    }
}
