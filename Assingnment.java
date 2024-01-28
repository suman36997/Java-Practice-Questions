import java.util.Scanner;
import java.lang.String;

class login{
    String email, password;
   
    login(){

    }
    login(String email,String password,Employee em){
        this.email=email;
        this.password=password;
    
    if(email.equals("admin@gmail.com")&& password.equals("admin123")){
        System.out.println("Enter the Employee name , DOB , Phoneno. , Age , AcNo.");
        String name,dob,phoneNo,Acno;
        int age;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        dob=sc.next();
        phoneNo=sc.next();
        age=sc.nextInt();
        Acno=sc.next();
        em.setdata(name, dob, phoneNo, age, Acno);
        System.out.println(name+" Details:");
        em.display();
    } 
    else{
        System.out.println("User not found");
    }
}
}
class Employee{
    String name;
    String dob;
    String phone;
    int age;
    String acno;
    Employee(){

    }
    Employee(String name,String dob,String phone,int age,String acno){
        
        this.name=name;
        this.dob=dob;
        this.phone=phone;
        this.age=age;
        this.acno=acno;


    }
    public void setdata(String name,String dob,String phone,int age,String acno){
        this.name=name;
        this.dob=dob;
        this.phone=phone;
        this.age=age;
        this.acno=acno;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Dob : "+dob);
        System.out.println("Phone no. : "+phone);
        System.out.println("age : "+age);
        System.out.println("Account no. : "+acno);

    }

}
class bank{
    int money;
    bank(){

    
    }
    bank(int money){
        this.money=money;

    }
    public void Deposit(int dep){
        money=money+dep;
        System.out.println("Now your total balance is : "+money);
        
    }
    public void withdraw(int wit){
        money=money-wit;
        System.out.println("Now your total balance is : "+money);

    }
    public void Balance(){
        System.out.println("Total balace is "+money);
    }
    
}
public class Assingnment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email,pass;
        System.out.println("Enter the email and password ");
        email=sc.next();
        pass=sc.next();
        Employee em=new Employee();
        
        login l1=new login(email,pass,em);
       

        
        bank B=new bank(5000);
        int option;
        System.out.println("What do you want");
        System.out.println("Press 1 for check Balace");

        System.out.println("Press 2 for Deposit");
        System.out.println("Press 3 for withdraw");
        int terminate=sc.nextInt();

        while(terminate!=0){

            option=sc.nextInt();
            switch(option){
                case 1:
                B.Balance();
                break;
                case 2:
                System.out.println("How much amount you want to deposit");
                int dep=sc.nextInt();
                B.Deposit(dep);
                break;
                case 3:
                System.out.println("How much amount you want to withdraw");
    
                int wit;
                wit=sc.nextInt();
                B.withdraw(wit);
                break;
                default:
                    System.out.println("Try again");
                
    
            }
        }
       



    }
}
