package Day_4;


import java.util.Scanner;

public class PTbac2 {
    private final double a;
    private final double b;
    private final double c;
    private double delta;
    public PTbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return this.delta;
    }
    public double getRoot1() {
        double x;
        if (this.delta >= 0) {
            x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        } else {
            x = 0;
        }
        return x;
    }
    public double getRoot2() {
        double y;
        if (this.delta >= 0) {
            y = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        } else {
            y = 0;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scan.nextDouble();
        System.out.println("Nhap b: ");
        double b = scan.nextDouble();
        System.out.println("Nhap c: ");
        double c = scan.nextDouble();
        PTbac2 pTbac2 = new PTbac2(a, b, c);
        System.out.println("delta: ");
        System.out.println(pTbac2.getDelta());
        if (pTbac2.getDelta() > 0) {
            System.out.println("nghiem 1 la");
            System.out.println(pTbac2.getRoot1());
            System.out.println("nghiem 2 la");
            System.out.println(pTbac2.getRoot2());
        } else if (pTbac2.getDelta() == 0) {
            System.out.println("Pt co nghiem kep");
            System.out.println(pTbac2.getRoot1());
        } else {
            System.out.println("Pt vo nghiem");
        }
    }
}
