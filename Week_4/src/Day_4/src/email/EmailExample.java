package email;

import java.util.regex.Pattern;

public class EmailExample {
    private static boolean matcher;
    private static final String Email_regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static boolean validate(String regex) {
        matcher = Pattern.matches(Email_regex,regex);
        return matcher;
    }
}
