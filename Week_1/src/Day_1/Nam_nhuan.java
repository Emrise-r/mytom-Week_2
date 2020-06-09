package Day_1;
import java.util.Scanner;
public class Nam_nhuan {
    public static void main(String[] args) {
        System.out.println("nhap nam can kiem tra: ");
        Scanner scan = new Scanner(System.in);
        int nam = scan.nextInt();
        boolean namnhuan = false;
        boolean c4 = nam % 4 == 0;
        boolean c100 = nam % 100 == 0;
        boolean c400 = nam % 400 == 0;
        if (c4) {
            if (c100) {
                if (c400) {
                    namnhuan = true;
                }
            } else {
                namnhuan = true;
            }
        }
        if (namnhuan) {
            System.out.printf("%d la nam nhuan", nam);
        } else {
            System.out.printf("%d ko la nam nhuan", nam);
        }
    }
}
