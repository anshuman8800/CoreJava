package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Token  {
    List<Integer> tokens;

    Token() {
        this.tokens = new ArrayList<>();
    }

    void producer(Integer num) throws InterruptedException {
        tokens.add(num);
        System.out.println("-->" + num);
        Thread.sleep(1000);
    }

    void consumer() throws InterruptedException {
        if(tokens.isEmpty()) {
            System.out.println("producer is empty");
        }
        int num = tokens.get(0);
        tokens.remove(0);
        System.out.println(num);
        Thread.sleep(2000);
    }
}
public class ProducerConsume {
    public static void main(String[] args) {
        Token token = new Token();
        Thread thread1 = new Thread(() -> {
            while(true) {
                Random random = new Random();
                int num = random.nextInt(100);
                try {
                    token.producer(num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            while(true) {
                try {
                    token.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
