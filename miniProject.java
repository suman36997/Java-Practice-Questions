import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private float marks;

    public Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public float getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public void updateMarks(float marks) {
        this.marks = marks;
    }

    public void updateName(String name) {
        this.name = name;
    }
}

class StudentRecordSystem {
    private ArrayList<Student> students;

    public StudentRecordSystem() {
        students = new ArrayList<>();
    }

    public void insertStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter marks: ");
        float marks = scanner.nextFloat();

        Student student = new Student(name, rollNumber, marks);
        students.add(student);
        System.out.println("Student record inserted successfully!");
    }

    public void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number of the student: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    public void updateAcademicRecords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number of the student: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Enter new marks: ");
                float marks = scanner.nextFloat();
                student.updateMarks(marks);
                System.out.println("Academic records updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    public void modifyStudentRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number of the student: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Enter new name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                student.updateName(name);
                System.out.println("Student record modified successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    public void generateMarksheet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number of the student: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("----- Marksheet -----");
                student.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    public void deleteStudentRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number of the student: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                students.remove(i);
                System.out.println("Student record deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }
}

public class miniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRecordSystem recordSystem = new StudentRecordSystem();

        while (true) {
            System.out.println("\n------ Menu ------");
            System.out.println("1. Insert new student");
            System.out.println("2. Search student");
            System.out.println("3. Update academic records");
            System.out.println("4. Modify student record");
            System.out.println("5. Generate marksheet");
            System.out.println("6. Delete student record");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    recordSystem.insertStudent();
                    break;
                case 2:
                    recordSystem.searchStudent();
                    break;
                case 3:
                    recordSystem.updateAcademicRecords();
                    break;
                case 4:
                    recordSystem.modifyStudentRecord();
                    break;
                case 5:
                    recordSystem.generateMarksheet();
                    break;
                case 6:
                    recordSystem.deleteStudentRecord();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}