package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread newThread = new BasicThread();
        newThread.start();
        // Don't call the run method directly, call start method
        MyRunnable newMyRunnable = new MyRunnable();
        Thread newThreadFromRunnableClass = new Thread(newMyRunnable);
        newThreadFromRunnableClass.start();
        Thread tempThread = new Thread(() -> {
            int i = 0;
            while(true) {
                System.out.println("i " + i);
                i++;
            }
        });

        Thread tempThread1 = new Thread(() -> {
            int i = 0;
            while(true) {
                System.out.println("j " + i);
                i++;
            }
        });

        Thread tempThread2 = new Thread(() -> {
            int i = 0;
            while(true) {
                System.out.println("k " + i);
                i++;
            }
        });
        tempThread.start();
        tempThread2.start();
        tempThread1.start();
    }
}
