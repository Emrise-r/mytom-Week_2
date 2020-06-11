package Day_3;

public class Minarr {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.floor(Math.random() * 10 + 10));
            System.out.println(a[i]);
        }
        System.out.println("\n" + minarr(a));
    }
    public static int minarr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
