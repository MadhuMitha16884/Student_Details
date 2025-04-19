import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String category;
    private int rollNumber;

    public Student(String name, int age, String category, int rollNumber) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.rollNumber = rollNumber;
    }

    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Category   : " + category);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students to register: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for Student #" + (i + 1));
            
            System.out.print("Enter Roll Number: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter Category (General/SC/ST/OBC): ");
            String category = scanner.nextLine();

            Student student = new Student(name, age, category, roll);
            students.add(student);
        }

        System.out.println("\n--- All Registered Students ---");
        for (Student s : students) {
            s.displayInfo();
        }

        scanner.close();
    }
}
