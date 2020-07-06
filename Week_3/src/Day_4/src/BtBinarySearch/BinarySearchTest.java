package BtBinarySearch;

import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100 + 100);
        }
        InsertionSort.InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nNhap gia tri can tim kiem:");
        int value = scan.nextInt();
        int result = BinarySearch.BinarySearch(arr,0,arr.length - 1, value);
        System.out.println("\nVi tri cua gia tri can tim la:");
        System.out.println(result);
    }
}
