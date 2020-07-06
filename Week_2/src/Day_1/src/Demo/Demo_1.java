package Demo;

public class Demo_1 {
    public static void main(String[] args) {
        C a = new C();
        a.d(10);
        a.d(10.0);

    }
}
class C extends D {
    public void d (double number) {
        System.out.println(number);
    }
}
class D {
    public void d (double number) {
        System.out.println(number * 2);
    }
}