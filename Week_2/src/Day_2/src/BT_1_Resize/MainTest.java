package BT_1_Resize;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle(6.0, "blue", true);
        Rectangle rectangle = new Rectangle(4, 6, "cyan", true);
        Square square = new Square(8, "dark", false);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        circle.resize(15);
        rectangle.resize(30);
        square.resize(20);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
