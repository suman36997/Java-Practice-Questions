import java.util.Scanner;
class vote{
    
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied!you are not able to give vote");
        }
        else{
            System.out.println("Access Denied! You are not able to give vote");
        }
    }
    
}
public class Exception {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age to check vote");

        int age=s.nextInt();
        vote v=new vote();
        v.checkAge(age);

    }
}
