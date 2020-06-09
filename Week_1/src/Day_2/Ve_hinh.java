package Day_2;

import java.util.Scanner;

public class Ve_hinh {
    public static void main(String[] args) {
        int n = -1;
        Scanner scan = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Menu");
            System.out.println("1. triangle");
            System.out.println("2. square");
            System.out.println("3. rectangle");
            System.out.println("0. Exit");
            System.out.println("Nhap hinh ban muon ve:");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
