class Student{
    int roll_no;
    String name;
    Address addr;
    Student(){

    }

    Student(int roll_no1,String name1,Address addr1){
        roll_no=roll_no1;
        name=name1;
        addr=addr1;
    }
    void printdata(){
        System.out.println("Student roll no. is " + roll_no);
        System.out.println("Student name no. is " + name);
        System.out.println("village : " +addr.vill);
        System.out.println("pin no. : " +addr.pin);
        // addr.printdata();

    }

}
class Address{
String vill,pin;
Address(String vill1,String pin1){
    vill=vill1;
    pin=pin1;
}
 void printdata(){
    System.out.println("village is "+ vill);
    System.out.println("pin no. is "+ pin);
}

}
public class one_to_one {
    public static void main(String[] args) {
        Address add=new Address("Sohdih","803101");
        Student std=new Student(01,"Suman",add);
        std.printdata();
        

    }
}
