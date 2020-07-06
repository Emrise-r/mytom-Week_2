package btchangeDecimalBinary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainchange {
    public static void main(String[] args) {
        List<Integer> stack = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so can doi: ");
        int n = scan.nextInt();
        do {
            stack.add(n % 2);
            n /= 2;
        } while (n != 0);

      for (int i = stack.size() - 1;i >= 0; i--) {
          System.out.printf("%s ", stack.get(i));
      }
    }
}
