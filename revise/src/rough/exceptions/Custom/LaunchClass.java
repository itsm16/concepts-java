package rough.exceptions.Custom;

import rough.exceptions.ExceptionHandled;

import java.sql.SQLOutput;
import java.util.Scanner;

class NoSuchUserException extends Exception {

}

class ATM{
    private int pw=1234;
    private int acc=424;

    int password;
    int accNumber;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Acc. No.");
        accNumber = sc.nextInt();

        System.out.println("Password-");
        password = sc.nextInt();
    }

    void verify() throws NoSuchUserException{
        if((password==pw) && (accNumber == acc)){
            System.out.println("right");
        }else{
//            NoSuchUserException not = new NoSuchUserException();
//            throw not;

            throw new NoSuchUserException();
        }
    }
}

class Bank{
    void initiate(){
        ATM someAtm = new ATM();
        try {
            someAtm.input();
            someAtm.verify();
        }
        catch (NoSuchUserException exception){
            System.out.println("invalid user");
        }
    }
}

public class LaunchClass {

    public static void main(String[] args) {
        Bank someBank = new Bank();
        someBank.initiate();
    }
}
