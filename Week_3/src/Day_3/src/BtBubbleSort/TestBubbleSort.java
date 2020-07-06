package BtBubbleSort;

import java.util.Scanner;

public class TestBubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) Math.floor(Math.random() * 100 + 10);
        }
        BubbleSort.bubbleSortByStep(list);
    }
}
