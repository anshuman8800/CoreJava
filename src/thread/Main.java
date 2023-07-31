package thread;

public class Main {

    public static void getThreadName() {
        switch (Thread.currentThread().getName()) {
            case "temp0" -> System.out.println("switch temp0");
            case "temp1" -> System.out.println("switch temp1");
            case "temp2" -> System.out.println("switch temp2");
            default -> System.out.println("I don't know... " + Thread.currentThread().getName());
        }
    }
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
            getThreadName();
        });

        Thread tempThread1 = new Thread(() -> {
            System.out.println("thread1");
            getThreadName();
        });

        Thread tempThread2 = new Thread(() -> {
            System.out.println("thread2");
            getThreadName();
        });
        System.out.println("T0 priority : " + tempThread.getPriority());
        System.out.println("T1 priority" + tempThread1.getPriority());
        tempThread1.setPriority(10);
        System.out.println("T1 priority " + tempThread1.getPriority());
        tempThread.setName("temp0");
        tempThread1.setName("temp1");
        tempThread2.setName("temp2");
        tempThread.start();
        tempThread1.start();
        tempThread2.start();
    }
}
