package circle;

public class Main {
    public static void main(String[] args) {
        Tao_circle circle1 = new Tao_circle();
        Tao_circle circle2 = new Tao_circle(5);
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        circle2.getArea();
        System.out.println(circle2.getArea());
    }
}
