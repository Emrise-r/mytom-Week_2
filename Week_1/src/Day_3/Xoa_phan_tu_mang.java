package Day_3;

import java.util.Scanner;

public class Xoa_phan_tu_mang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = {4, 5, 6, 7, 9, 41, 23, 10};
        System.out.println("Nhap so can tra: ");
        int n = scan.nextInt();
        delarr(a,n);
        for ( int y : a) {
            System.out.println(y);
        }

    }
    public static void delarr(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        arr[arr.length - 1] = 0;
    }
}
