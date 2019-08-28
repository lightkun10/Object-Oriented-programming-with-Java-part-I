import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account panduAccount = new Account("Pandu's account", 100.00);

        panduAccount.deposit(20);

        System.out.println(panduAccount.toString());

    }

}
