package Bt_1_Circle_Cylinder;

public class Test_Cylinder {
    public static void main(String[] args) {
        Circle[] c = new Circle[3];
        c[0] = new Circle(10, "red");
        c[1] = new Cylinder(5,"blue",6);
        c[2] = new Cylinder(10, "cyan", 5);
        System.out.println(c[1].getArea());
        System.out.println(c[2]);
    }
}
