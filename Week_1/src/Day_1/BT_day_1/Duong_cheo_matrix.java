package Day_1.BT_day_1;

import java.util.Scanner;

public class Duong_cheo_matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhap ma tran vuong cap: ");
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.floor(Math.random() * 10 + 10));
                System.out.print(a[i][j] + " ");
                if (i == j) {
                   sum += a[i][j];
                }
            }
        }
        System.out.println("\n");
        System.out.println("Tong duong cheo chinh la");
        System.out.println(sum);
    }
}
