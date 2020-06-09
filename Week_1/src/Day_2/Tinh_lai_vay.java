package Day_2;

import java.util.Scanner;

public class Tinh_lai_vay {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Nhap so tien gui:");
        double m = Scan.nextDouble();
        System.out.println("Nhap lai suat:");
        double s = Scan.nextDouble();
        System.out.println("Nhap so thang gui:");
        int t = Scan.nextInt();
        double tong = 0;
        for (int i = 1; i <= t; i++) {
            tong = m * (s / 100) /12 * i;
        }
        System.out.println(tong);
    }
}
