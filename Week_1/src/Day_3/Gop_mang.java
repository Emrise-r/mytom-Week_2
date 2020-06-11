package Day_3;

public class Gop_mang {
    public static void main(String[] args) {
        int a1[] = new int[10];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.floor(Math.random() * 10 + 10));
            System.out.print(a1[i] + " ");
        }
        System.out.println("\n");
        int a2[] = new int[15];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (int) (Math.floor(Math.random() * 10 + 10));
            System.out.print(a2[i] + " ");
        }
        int a[] = new int[25];
        gopmang(a, a1, a2);
        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void gopmang(int[] a, int[] a1, int[] a2) {
        for (int i = 0; i < a1.length; i++) {
            a[i] = a1[i];
        }
        for (int i = 0, j = a1.length; i < a2.length; i++, j++) {
            a[j] = a2[i];
        }
    }
}
