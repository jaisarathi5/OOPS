import java.util.*;

interface CourseSelection{
    void display();
}

class Aids implements CourseSelection {
    void display() {
        System.out.println("-----About the course AIDS-----");
        System.out.println("Required Cutoff in 12th: 199.0");
        System.out.println("Fees for 1 year : 3 lakh");
        System.out.println("Exam Fee : Changes According To Syllabus");
        System.out.println("Course Duration: 4 years");
        System.out.println("Specializations: Artificial Intelligence, Data Science, Machine Learning");
        System.out.println("Career Opportunities: Data Scientist, AI Engineer, Business Analyst");
    }
}

class Cse implements CourseSelection {
    void display() {
        System.out.println("-----About the course CSE-----");
        System.out.println("Required Cutoff in 12th: 198.2");
        System.out.println("Fees for 1 year : 3.5 lakh");
        System.out.println("Exam Fee : Changes According To Syllabus");
        System.out.println("Course Duration: 4 years");
        System.out.println("Specializations: AI, Data Science, Cybersecurity");
        System.out.println("Career Opportunities: Software Engineer, Data Analyst, Researcher");
    }
}

class It implements CourseSelection {
    void display() {
        System.out.println("-----About the course IT-----");
        System.out.println("Required Cutoff in 12th: 196.8");
        System.out.println("Fees for 1 year : 3 lakh");
        System.out.println("Exam Fee : Changes According To Syllabus");
        System.out.println("Course Duration: 4 years");
        System.out.println("Specializations: Cloud Computing, Networking, Web Development");
        System.out.println("Career Opportunities: System Administrator, Web Developer, IT Consultant");
    }
}

class Ece implements CourseSelection {
    void display() {
        System.out.println("-----About the course ECE-----");
        System.out.println("Required Cutoff in 12th: 194.5");
        System.out.println("Fees for 1 year : 2.8 lakh");
        System.out.println("Exam Fee : Changes According To Syllabus");
        System.out.println("Course Duration: 4 years");
        System.out.println("Specializations: VLSI Design, Embedded Systems, Communication Engineering");
        System.out.println("Career Opportunities: Electronics Engineer, Chip Designer, Telecom Specialist");
    }
}

class Mech implements CourseSelection {
    void display() {
        System.out.println("-----About the course MECH-----");
        System.out.println("Required Cutoff in 12th: 190.0");
        System.out.println("Fees for 1 year : 2.5 lakh");
        System.out.println("Exam Fee : Changes According To Syllabus");
        System.out.println("Course Duration: 4 years");
        System.out.println("Specializations: Robotics, Thermal Engineering, Automotive Engineering");
        System.out.println("Career Opportunities: Mechanical Engineer, Design Engineer, Automotive Specialist");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a course by entering the number:");
        System.out.println("1. AIDS");
        System.out.println("2. CSE");
        System.out.println("3. IT");
        System.out.println("4. ECE");
        System.out.println("5. MECH");

        int choice = sc.nextInt();

        if (choice == 1) {
            Aids a = new Aids();
            a.display();
        } 
        else if (choice == 2) {
            Cse c = new Cse();
            c.display();
        } 
        else if (choice == 3) {
            It i = new It();
            i.display();
        } 
        else if (choice == 4) {
            Ece e = new Ece();
            e.display();
        } 
        else if (choice == 5) {
            Mech m = new Mech();
            m.display();
        } 
        else {
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}