import java.util.ArrayList;
import java.util.Scanner;
class student{
    private String name;
    private int rollNumber;
    private float marks;
    student(String name,int rollNumber,float marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public float getMarks(){
        return marks;
    }
    public void updateRollno(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public void updateMarks(float marks){
        this.marks=marks;
    }
    






    public void studentDetails(){
        System.out.println("Name: "+name);
        System.out.println("roll No.:"+rollNumber);
        System.out.println("Marks: "+marks);
    }

}
class StudentRecordSystem{
    ArrayList<student>students;
    StudentRecordSystem(){
        students=new ArrayList<>();
    }
   

    public void insertStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll number: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter marks: ");
        float marks = sc.nextFloat();

        student st = new student(name, rollNumber, marks);
        students.add(st);
        System.out.println("Student record inserted successfully!");


    }






    public void searchStudent(){
	Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of student ");
        name=sc.nextLine();
        boolean found=false;
        for(student st:students){
            if(st.getName().equals(name)){
                found=true;
                System.out.println("Student found");
                st.studentDetails();
                break;
               
            }
           
        }
        if(!found){
            System.out.println("Student Not found");
        }
    }












 public void modifyStudentRecord(){
	Scanner sc=new Scanner(System.in);

        String name;
        
        int roll;

        System.out.println("Enter the name of student");
        name=sc.nextLine();
        boolean found=true;
        for(student st:students){
            if(st.getName().equals(name)){
                System.out.println("Enter the new roll");
                roll=sc.nextInt();
                st.updateRollno(roll);
                System.out.println("Student record modify successfully");

                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
    public void generateMarksheet(){
	Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of student");
        name=sc.nextLine();
        boolean found=false;
        for(student st:students){
            if(st.getName().equals(name)){
                found=true;
                st.studentDetails();
                break;
            }
        }
     



   if(!found){
            System.out.println("Student not found");
        }
    }
    public void updateAcademicRecords(){
	Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of student");
        name=sc.nextLine();
        float marks;
        boolean found=false;
        for(student st:students){
            if(st.getName().equals(name)){
                found=true;
                System.out.println("Enter new marks");
                marks=sc.nextFloat();
                st.updateMarks(marks);
                System.out.println("Academic record update successfully");
                break;
            }
        }
        if(!found){
            System.out.println("Stuent not found");
        }
    }









   public void deleteStudentRecord(){
	Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of student");
        name=sc.nextLine();
        boolean found=false;
        for(student st:students){
            if(st.getName().equals(name)){
                students.remove(st);
                found=true;
                break;

            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
}


public class miniprofect3 {
    public static void main(String args[]){
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
