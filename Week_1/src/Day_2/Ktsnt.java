package Day_2;

import java.util.Scanner;

public class Ktsnt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int n = scan.nextInt();
        if (n < 2) {
            System.out.printf("%d Ko phai Snt", n);
        }
        if (n >= 2) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf("%d La so nguyen to", n);
            }
            else {
                System.out.printf("%d Ko phai Snt", n);
            }
        }
    }
}
