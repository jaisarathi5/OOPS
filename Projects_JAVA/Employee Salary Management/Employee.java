import java.util.*;
class SalaryManagement{
    private long salary;
    private int hra;
    private int electricity;
    private int shopping;
    private int savings;

    public void setSalary(long a){
        this.salary = a;
    }
    public void setHra(int b){
        this.hra = b;
    }
    public void setElectricity(int c){
        this.electricity = c;
    }
    public void setShopping(int d){
        this.shopping = d;
    }
    public void setSavings(int e){
        this.savings = e;
    }

    public long getSalary(){
        return salary;
    }
    public int getSalaryetHra(){
        return hra;
    }
    public int getElectricity(){
        return electricity;
    }
    public int getShopping(){
        return shopping;
    }
    public int getSavings(){
        return savings;
    }
    void display(){

        System.out.println("Salary of the Employee: "+salary);
        System.out.println("House rent Allowance: "+hra);
        System.out.println("Electric bill: "+electricity);
        System.out.println("Shopping bill: "+shopping);
        System.out.println("Savings in this month: "+savings);
        double total = salary - (hra + electricity + shopping + savings);
        if(total<0){
            System.out.println("Your Expenses are more than your Salary");
        }
        else{
            System.out.println("Your Total  Extra Savings in this month: "+total);
        }
    }
}
public class Employee{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        SalaryManagement S = new SalaryManagement();
        System.out.print("Enter the Salary of the Employee: ");
        long a = s.nextLong();
        System.out.print("Enter the House Rent Allowance: ");
        int b = s.nextInt();
        System.out.print("Enter the Electricity Bill: ");
        int c = s.nextInt();
        System.out.print("Enter the Shopping Bill: ");
        int d = s.nextInt();
        System.out.print("Enter the Savings in this month: ");
        int e = s.nextInt();

        S.setSalary(a);
        S.setHra(b);
        S.setElectricity(c);
        S.setShopping(d);
        S.setSavings(e);

        S.display();
    }
}