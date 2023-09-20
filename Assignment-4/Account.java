import java.util.Scanner;
public class Account {
    static int balance = 100000;
    static Scanner sc = new Scanner(System.in);
    static void deposit(int amt){
        balance += amt;
        System.out.println("deposit amount is "+amt);
        System.out.println("Your Current Balance is "+balance);
        process();
    }
    static void withdrawal(int amt){
        balance -= amt;
        System.out.println("Withdrawal amount is "+amt);
        System.out.println("Your Current Balance is "+balance);
        process();
    }
    static void checkBalance(int amt) {
        if (amt <= balance) {
            withdrawal(amt);
        } else {
            System.out.println("-----Sufficient balance is not there in the account-----");
            process();
        }
    }
    static void process(){
        System.out.print("\nDo you want to Deposit or Withdrawal [y/n] : ");
        String input = sc.next();
        if (input.equals("y") || input.equals("Y")) {
            System.out.print("Withdrawal / Deposit [w/d] : ");
            String value = sc.next();
            System.out.print("Enter the Amount :");
            int amt = sc.nextInt();
            if (value.equals("w")) {
                checkBalance(amt);
            } else {
                deposit(amt);
            }
        }else {
            System.out.println("----------- Thank You -----------");
        }
    }
    public static void main(String[] args) {
        System.out.println("Your Current Balance : "+balance);
        System.out.print("Withdrawal / Deposit [w/d] : ");
        String value = sc.next();
        System.out.print("Enter the Amount :");
        int amt = sc.nextInt();
        if (value.equals("w")){
            checkBalance(amt);
        }else{
            deposit(amt);
        }
    }
}