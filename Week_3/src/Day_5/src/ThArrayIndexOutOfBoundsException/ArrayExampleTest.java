package ThArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class ArrayExampleTest {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scan = new Scanner(System.in);
        System.out.println("\nNhap 1 so bat ky: ");
        int x = scan.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + " la: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi han cua mang");
        }
    }
}
