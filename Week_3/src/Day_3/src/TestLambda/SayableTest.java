package TestLambda;

public class SayableTest {
    public static void main(String[] args) {
        Sayable hi = ten -> "Shut down " + ten;
        System.out.println(hi.say("Thang"));
    }
}
