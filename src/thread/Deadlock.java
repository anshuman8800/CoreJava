package thread;

import java.util.ArrayList;
import java.util.List;

public class Deadlock {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(
                        0, 0 ,0
                )
        );

        ThreadA threadA = new ThreadA(list);
        ThreadB threadB = new ThreadB(list);
        ThreadC threadC = new ThreadC(list);

        threadC.run();
        threadA.run();
        threadB.run();

    }
}
class ThreadA implements Runnable {
    List<Integer> list;

    ThreadA(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(list.get(0) == 0) {
            try {
                System.out.println("threadA");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(list.get(0) > 0) {
            System.out.println("execute threadA");
            list.set(1, list.get(1) + 1);
        }
    }
}

class ThreadB implements Runnable {
    List<Integer> list;

    ThreadB(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(list.get(1) == 0) {
            try {
                System.out.println("threadB");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(list.get(1) > 0) {
            System.out.println("execute threadB");
            list.set(2, list.get(2) + 1);
        }
    }
}

class ThreadC implements Runnable {
    List<Integer> list;

    ThreadC(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(list.get(2) == 0) {
            try {
                System.out.println("threadC");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(list.get(2) > 0) {
            System.out.println("execute threadC");
            list.set(0, list.get(0) + 1);
        }
    }
}
