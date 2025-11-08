package OOPS;

public class BankAccount {
        private long accountNumber;
        private double balance;

        public void deposit(double amt){
            if (amt < 0){
                System.out.println("Invalid Amount");
            }else{
            balance = balance + amt;
            System.out.println("Amount Deposited: "+ amt);
            }
        }

        public void withdraw(double amt){
            if(amt < 0 || amt > balance){
                System.out.println("Invalid Amount");
            }else{
                balance = balance - amt;
                System.out.println("Amount Withdrawn: "+ amt);
            }
        }

        public double getBalance(){
            return balance;
        }
}
