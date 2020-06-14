package Day_1.BT_day_1;

import java.util.Scanner;

public class Tong_arr {
    public static void main(String[] args) {
        double t = 0;
        Scanner scan = new Scanner(System.in);
        int n = (int) (Math.random() * 10) + 5;
        double[][] Arr = new double[10][n];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < n; j++) {
                 Arr[i][j] = (Math.random() * 50.0) +10.0;
            }
        }
        System.out.println("Nhap hang can tinh tong: ");
        int m = scan.nextInt();
        for (int j = 0; j < n; j++) {
             t += Arr[m][j];
        }
        System.out.println("tong can tim la");
        System.out.println(t);
    }
}
