package BT_Thread;

import java.util.Random;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            index = new Random().nextInt(100);
            System.out.println(index + " " + this.hashCode());
        }
            System.out.println("\n");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
