import java.util.*;
public class Bank{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("-----Bank Management Details-----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance Check");
        System.out.print("Enter the Procees Position number: ");
        int n = s.nextInt();
        s.nextLine();
        double a = 11029.93;
        BankDetails B;
        if(n==1){
            System.out.print("Enter the Deposit Amount: ");
            int b = s.nextInt();
            B = new Deposit(a, b);
            B.display();
        }
        else if(n==2){
            System.out.print("Enter the Withdrawal Amount: ");
            int b = s.nextInt();
            B = new Withdraw(a, b);
            B.display();
        }
        else if(n==3){
            B = new Balancecheck(a);
            B.display();
        }
    }
}
abstract class BankDetails{
    protected double balance;
    BankDetails(double a){
        this.balance = a;
    }
    abstract void display();
}
class Deposit extends BankDetails{
    protected long amount;
    Deposit(double a, long b){
        super(a);
        this.amount = b;
    }
    void display(){
        balance += amount;
        System.out.println("Deposit Amount: "+amount);
        System.out.println("Account Balance After Deposit: "+balance);
    }
}
class Withdraw extends BankDetails{
    protected long amount;
    Withdraw(double a, long b){
        super(a);
        this.amount = b;
    }
    void display(){
        balance -= amount;
        System.out.println("Withdrawal Amount: "+amount);
        System.out.println("Account Balance After Withdrawal: "+balance);
    }
}
class Balancecheck extends BankDetails{
    Balancecheck(double a){
        super(a);
    }
    void display(){
        System.out.println("Your Available Balance : "+ balance);
    }
}
