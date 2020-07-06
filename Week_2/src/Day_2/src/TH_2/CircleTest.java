package TH_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(4.0);
        circle.setRadius(10);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle.getRadius());

    }
}
