package BT_4_Triangle;

public class Shape {
    public String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape with color = "
                + color;
    }
}
