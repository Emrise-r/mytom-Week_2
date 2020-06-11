package Day_3;

import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so can them");
        int n = scan.nextInt();
        System.out.println("Nhap vi tri can them");
        int l = scan.nextInt();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.floor(Math.random() * 10 + 10));
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        addarr(a, n, l);
    }
    public static void addarr(int[] a, int n, int l) {
        int[] a2 = new int[11];
        for (int i = 0; i < l; i++) {
            a2[i] = a[i];
        }
        a2[l] = n;
        for (int i = l + 1; i < a2.length; i++) {
            a2[i] = a[i - 1];
        }
        for (int y : a2) {
            System.out.print(y + " ");
        }
    }
}
