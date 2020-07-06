package palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chuoi can check: ");
        String abc = scan.nextLine();
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < abc.length(); i++) {
            stack.add(abc.charAt(i));
        }
        boolean checked = true;
        for (int i = 0; i < stack.size() / 2; i++) {
            if (stack.get(i) != stack.get(stack.size() - 1 - i)) {
                checked = false;
                break;
            }
        }
        if (checked) {
            System.out.println("is Palindrome !!!");
        } else System.out.println("isn' t Palindrome !!!");
    }
}
