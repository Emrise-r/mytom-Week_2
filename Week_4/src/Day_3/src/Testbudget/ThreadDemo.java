package Testbudget;

public class ThreadDemo {
    static int budget = 1000;
    static class Table {
        synchronized void printTable(int n) throws InterruptedException {
            if (budget > 0) {
                budget -= 10;
                Thread.sleep(50);
                System.out.println(n + " Budget " + budget);
            } else {
                Thread.currentThread().interrupt();
            }
        }
    }
    static class MyThread extends Thread {
        ThreadDemo.Table table;
        
    }
}
