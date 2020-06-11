package Day_3;

import java.util.Scanner;

public class Min_ma_tran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma tran vuong cap: ");
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(Math.floor(Math.random() * 10 + 10));
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("\n");
        maxm(a, n);
    }
    public static void maxm(int[][] arr, int x) {
        int max = arr[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Max la: " + max + " o vi tri: " + a + ", " + b);
    }
}
