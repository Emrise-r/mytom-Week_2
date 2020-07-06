package email;

public class CheckEmail {
    public static void main(String[] args) {
        String email1 = "emrise321@gmail.com";
        String email2 = "nqvinh98@gmail.com";
        String email3 = "masterxrz@hotmail.com";
        String email4 = "ronis14@yahoo.net";
        System.out.println(email1 + ": " + EmailExample.validate(email1));
        System.out.println(email2 + ": " + EmailExample.validate(email2));
        System.out.println(email3 + ": " + EmailExample.validate(email3));
        System.out.println(email4 + ": " + EmailExample.validate(email4));
    }
}
