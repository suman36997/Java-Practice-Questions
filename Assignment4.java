class person{
    String name;
    char gender;
    long phone;
    double basic_sal;
    person(){
        name="Suman";
        gender='M';
        phone=123456789;
        basic_sal=100000;

    }
    person(String nm,char gen,long ph,double sal){
        name=nm;
        gender=gen;
        phone=ph;
        basic_sal=sal;
    }
    person(String nm,double sal){
        name=nm;
        basic_sal=sal;
    }
    void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("phoneNo: "+phone);
        System.out.println("Salary: "+basic_sal);
    }
}
public class Assignment4 {
    public static void main(String []args){
        person p1=new person();
        person p2=new person("Saurav",'M',887311505,20000);
        person p3=new person("Aditya",700000);
        p1.getDetails();
        p2.getDetails();
        p3.getDetails();
    }
}
