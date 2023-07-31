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
            System.out.println("thread0");
        });

        Thread tempThread1 = new Thread(() -> {
            System.out.println("thread1");
        });

        Thread tempThread2 = new Thread(() -> {
            System.out.println("thread2");
        });
        System.out.println("T0 priority : " + tempThread.getPriority());
        System.out.println("T1 priority" + tempThread1.getPriority());
        tempThread1.setPriority(10);
        System.out.println("T1 priority " + tempThread1.getPriority());
        tempThread.start();
        tempThread1.start();
        tempThread2.start();
    }
}
