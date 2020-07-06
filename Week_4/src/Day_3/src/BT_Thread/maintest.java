package BT_Thread;

public class maintest {
    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator();
        NumberGenerator n2 = new NumberGenerator();
        NumberGenerator n3 = new NumberGenerator();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        Thread t3 = new Thread(n3);

        t1.start();
        t2.start();
        t3.start();
    }
}
