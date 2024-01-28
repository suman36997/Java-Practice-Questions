class Student{
    int roll_no;
    String name;
    Address []addr;
    Student(){

    }
    Student(int roll_no1 , String name1 , Address []addr1){
        roll_no=roll_no1;
        name=name1;
        addr=addr1;
    }
    void print(){
        System.out.println("Roll no. is : "+ roll_no);
        System.out.println("Name is : "+ name);
        for(int i=0;i<addr.length;i++){
        System.out.println("Village is  : "+ addr[i].vill);
        System.out.println("Pin is  : "+ addr[i].pin);

        }
        

    }

}

class Address{
    String vill,pin;
    Address(String vill1,String pin1){
        vill=vill1;
        pin=pin1;
    }
}
public class one_to_many {
    public static void main(String[] args) {
        Address addr1=new Address("sohdih","803118");
        Address addr2=new Address("Haldia","721657");
        Address addr3=new Address("poolpar","803101");
        Address addr4=new Address("patna","800001");
        Address[] addr5={addr1,addr2,addr3,addr4};
        Student std=new Student(01,"Saurav",addr5);
        std.print();

    }
    
}
