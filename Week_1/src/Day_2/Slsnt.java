package Day_2;

import java.util.Scanner;

public class Slsnt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in:");
        int N = scan.nextInt();
        int count = 0;
        int n = 2;
        while (count <= N) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) {
                    check = false;
                    break;
                }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
