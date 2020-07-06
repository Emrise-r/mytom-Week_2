package TH;

public class Rectangle_test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(20, 10);
        System.out.println(rectangle);
        rectangle = new Rectangle(15, 10, "illenium", false );
        System.out.println(rectangle);
    }
}
