package Day_1;

import java.util.Scanner;

public class Ntthg {
    public static void main(String[] args) {
        Scanner search = new Scanner(System.in);
        System.out.println("Nhap thang can tra: ");
        String daysInMonth;
        int month = search.nextInt();
        System.out.println(month);
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            case 2:
                daysInMonth = "28 or 29";
                break;
            default:
                daysInMonth = "31";
        }
        System.out.printf("Thang %d co %s ngay!", month, daysInMonth);
    }
}
