package Day_1;

import java.util.Scanner;

public class Ptbn {
    public static void main(String[] args) {
        System.out.println("Pt bac nhat dang");
        System.out.println("a * x + b = c");
        Scanner search = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = search.nextDouble();
        System.out.println("Nhap so b:");
        double b = search.nextDouble();
        if (a == 0) {
            if (b == 0 ) {
                System.out.println("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        }
        if (a != 0) {
            double x = (-b) / a;
            System.out.println("Pt co nghiem" + x);
        }
    }
}
