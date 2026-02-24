import java.util.*;
class LibraryInfo{
    String bookName;
    String author;
    String publisher;
    int yearPublished;
    String issuedmonth;
    String returnmonth;
    LibraryInfo(String a, String b, String c, int d, String e, String f){
        bookName = a;
        author = b;
        publisher = c;
        yearPublished = d;
        issuedmonth = e;
        returnmonth = f;
    }
    void display(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Issued Month: " + issuedmonth);
        System.out.println("Return Month: " + returnmonth);
    }
}
public class Library {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        System.out.println("Library Books List:");
        LibraryInfo L[] = new LibraryInfo[n];
        for(int i = 0; i < n; i++){
            String input = s.nextLine();
            String[] parts = input.split(",");
            String a = parts[0];
            String b = parts[1];
            String c = parts[2];
            int d = Integer.parseInt(parts[3]);
            String e = parts[4];
            String f = parts[5];
            L[i] = new LibraryInfo(a, b, c, d, e, f);
            L[i].display();
        }
        s.close();
    }
}