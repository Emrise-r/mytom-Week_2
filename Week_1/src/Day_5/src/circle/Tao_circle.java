package circle;

public class Tao_circle {
    private double radius = 1.0;
    private String color = "red";
    public Tao_circle() {};
    public Tao_circle(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
