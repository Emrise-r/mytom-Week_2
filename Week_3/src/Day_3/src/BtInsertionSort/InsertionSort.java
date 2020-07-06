package BtInsertionSort;

public class InsertionSort {
    public static void InsertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double temp = list[i];
            int j;
            for (j = i - 1; j >= 0 && temp < list[j]; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
    }
}
