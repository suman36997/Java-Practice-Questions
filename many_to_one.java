class Student{
    String id;
    String name;
    Course cor;
    Student(String id1,String name1 ,Course cor1){
        id=id1;
        name=name1;
        cor=cor1;
    }
   void  print(){
    System.out.println("Student id is : "+id);
    System.out.println("Student name is : "+name);
    System.out.println("Course taken by the student is  : "+cor.cr);
    }

}
class Course{
    String cr;
    Course(String cr){
        this.cr=cr;
    }
}


public class many_to_one {
    public static void main(String[] args) {
     Course cr=new Course("java");
    Student std1=new Student("003-20-0564", "Suman",cr );
    Student std2=new Student("003-20-0565", "Saurav", cr);
    Student std3=new Student("003-20-0566", "Aditya", cr);
    Student std4=new Student("003-20-0567", "Rohit", cr);
    std1.print();
    std2.print();
    std3.print();
    std4.print();
    }
    
    
}
