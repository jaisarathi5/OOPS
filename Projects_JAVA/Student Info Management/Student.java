import java.util.*;
class StudentInfo{
    String name;
    String dept;
    String fname;
    String mname;
    int age;
    int tenmark;
    int twlmark;
    StudentInfo(String a, String b, String c, String d, int e, int f, int g){
        name = a;
        dept = b;
        fname = c;
        mname = d;
        age = e;
        tenmark = f;
        twlmark = g;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Father's Name: " + fname);
        System.out.println("Mother's Name: " + mname);
        System.out.println("Age: " + age);
        System.out.println("10th Marks: " + tenmark);
        System.out.println("12th Marks: " + twlmark);
    }
}
public class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        System.out.println("Batch I Students List:");
        StudentInfo S[] = new StudentInfo[n];
        for(int i = 0; i < n; i++){
            String input = s.nextLine();
            String[] parts = input.split(",");
            String a = parts[0];
            String b = parts[1];
            String c = parts[2];
            String d = parts[3];
            int e = Integer.parseInt(parts[4]);
            int f = Integer.parseInt(parts[5]);
            int g = Integer.parseInt(parts[6]);
            S[i] = new StudentInfo(a, b, c, d, e, f, g);
            S[i].display();
        }
        s.close();
    }
}