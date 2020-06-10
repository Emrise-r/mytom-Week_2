package Day_3;

import java.util.Scanner;

public class Find_mang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = {"Minh", "Vinh", "Tuyen", "Hung", "Hieu", "Thang", "Long"};
        System.out.println("Nhap ten can tim: ");
        String name = scan.nextLine();
        boolean check = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(name)) {
                System.out.println(name + " co thu tu " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(name + " khong co ten trong danh sach");
        }
    }
}
