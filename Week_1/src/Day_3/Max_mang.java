package Day_3;
import java.util.Scanner;
public class Max_mang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhap so phan tu cua mang");
            size = scan.nextInt();
            if (size > 20) {
                System.out.println("Khai bao thap hon");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = scan.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
