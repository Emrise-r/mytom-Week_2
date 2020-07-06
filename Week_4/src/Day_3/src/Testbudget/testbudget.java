package Testbudget;

public class testbudget {
    public static int budget = 1000;
    public static void main(String[] args) {
        for(int i = 0; i < 1000; i++) {
            Budget b = new Budget();
            Thread t = new Thread(b);
            t.start();
            System.out.println(budget);
        }

    }
}
