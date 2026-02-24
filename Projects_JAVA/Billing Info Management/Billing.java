import java.util.*;
class BillingInfo {
    String customerName;
    String billingMonth;
    String product1;
    int amnt1;
    String product2;
    int amnt2;
    String product3;
    int amnt3;
    int TotalAmount;
    BillingInfo(String a, String b, String c, int d, String e, int f, String g, int h){
        customerName = a;
        billingMonth = b;
        product1 = c;
        amnt1 = d;
        product2 = e;
        amnt2 = f;
        product3 = g;
        amnt3 = h;
        TotalAmount = d+f+h;
    }
    void display(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Billing Month: " + billingMonth);
        System.out.println("Product 1: " + product1 + ", Amount: " + amnt1);
        System.out.println("Product 2: " + product2 + ", Amount: " + amnt2);
        System.out.println("Product 3: " + product3 + ", Amount: " + amnt3);
        System.out.println("Total Amount: " + TotalAmount);
    }
}
public class Billing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        System.out.println("Billing Information:");
        BillingInfo B[] = new BillingInfo[n];
        for(int i = 0; i < n; i++){
            String input = s.nextLine();
            String[] parts = input.split(",");
            String a = parts[0];
            String b = parts[1];
            String c = parts[2];
            int d = Integer.parseInt(parts[3]);
            String e = parts[4];
            int f = Integer.parseInt(parts[5]);
            String g = parts[6];
            int h = Integer.parseInt(parts[7]);
            B[i] = new BillingInfo(a, b, c, d, e, f, g, h);
            B[i].display();
        }
        s.close();
    }
}