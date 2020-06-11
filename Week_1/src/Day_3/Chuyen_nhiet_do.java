package Day_3;

import  java.util.Scanner;
public class Chuyen_nhiet_do {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double F;
        double C;
        do {
            System.out.println("Menu");
            System.out.println("1. Doi C sang F");
            System.out.println("2. Doi F sang C");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon cua ban: ");
            n = scan.nextInt();
            if (n > 2) {
                System.out.println("Toi chi co hai phuong an thoi, bo sung sau");
            }
        } while (n > 2);
        switch (n) {
            case 1:
                System.out.println("Nhap do C");
                C = scan.nextDouble();
                System.out.println(C + " Do C doi duoc " + CtoF(C) + "Do F");
                break;
            case 2:
                System.out.println("Nhap do F");
                F = scan.nextDouble();
                System.out.println(F + " Do F doi duoc " + FtoC(F) + "Do C");
                break;
            case 0:
                System.exit(0);
        }
    }
    public static double CtoF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double FtoC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}