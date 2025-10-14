import java.util.Scanner;

import OOPS.BankAccount;

public class Main{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        double balance = account.getBalance();
        account.deposit(100);
        account.withdraw(10);
        System.out.println("Current balance: "+ account.getBalance());
        System.out.println(balance);

        // OOPS.Cat blackCat = new OOPS.Cat();
        // test.Cat aCat = new test.Cat();

        // System.out.println(blackCat.allStriped);
        // System.out.println(aCat.isWhite);
    }
}