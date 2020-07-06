package Testbudget;

public class Budget implements Runnable {
    @Override
    public void run() {
        try {
            testbudget.budget -= 10;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
