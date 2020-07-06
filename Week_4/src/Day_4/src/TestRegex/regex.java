package TestRegex;

import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        boolean regex = Pattern.matches("(0|\\+84)[0-9]{9,11}","+84123449794");
        System.out.println(regex);
    }
}
