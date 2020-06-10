package Day_3;

import  java.util.Scanner;
public class Chuyen_nhiet_do {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Menu");
            System.out.println("1. Doi C sang F");
            System.out.println("2. Doi F sang C");
            System.out.println("0. Exit");
            n = scan.nextInt();
            if (n > 2) {
                System.out.println("Toi chi co hai phuong an thoi, bo sung sau");
            }
        }while (n > 2);
    }
}
