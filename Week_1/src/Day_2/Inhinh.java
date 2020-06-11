package Day_2;

public class Inhinh {
    public static void main(String[] args) {
        System.out.println("in hinh chu nhat");
        for (int i = 1; i <= 4; i++) {
            System.out.print("\n");
            for (int j = 1; j <= 6; j++) {
                System.out.print(" * ");
            }
        }
        System.out.print("\n");
        System.out.println("\n in hinh tam giac");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
        }
        System.out.print("\n");
        System.out.println("\n in hinh tam giac2");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n");
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print(" * ");
            }
        }
        System.out.print("\n");
        System.out.println("\n in hinh tam giac can");
        for (int i = 0; i < 5; i++) {
            System.out.print("\n");
            for (int j = i; j <= 5; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++ ) {
                System.out.print(" * ");
            }
        }
    }
}
