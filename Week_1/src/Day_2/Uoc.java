package Day_2;

import java.util.Scanner;

public class Uoc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = scan.nextInt();
        System.out.println("Nhap so b:");
        int b = scan.nextInt();
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            if (a < b) {
                b -= a;
            }
        }
        System.out.printf("%d La uoc chung lon nhat", a);
    }
}
