package Kt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<Student>();
        int n = -1;
        while (n != 0) {
            System.out.println("Chon 1 chuc nang \n");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Them vao danh sach");
            System.out.println("3. Xoa danh sach");
            System.out.println("0. Ket thuc");
            n = scan.nextInt();
            switch (n){
                case 1:
                    System.out.println("Danh sach sinh vien la:");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println("ID: " + i);
                        System.out.println("Name: " + studentList.get(i).getName());
                        System.out.println("Age: " + studentList.get(i).getAge() + "\n");
                    }
                    break;
                case 2:
                    System.out.printf("Nhap ten: ");
                    String name = scan.next();
                    System.out.printf("Nhap tuoi: ");
                    int age = scan.nextInt();
                    studentList.add(new Student(name, age));
                    System.out.println("Add Thanh cong\n");
                    break;
                case 3:
                    System.out.println("tong danh sach: " + studentList.size());
                    System.out.println("Nhap ID can xoa");
                    int l = scan.nextInt();
                    System.out.println("ID: " + l + " " + studentList.remove(l));
                    break;
                default:
                    System.out.println("Ko co lua chon do dau");
            }
        }
    }
}
