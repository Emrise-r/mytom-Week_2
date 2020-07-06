package Validate_account;

public class AccountTest {
    public static void main(String[] args) {
        AccountExample accountExample;

        String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }

    }
}
