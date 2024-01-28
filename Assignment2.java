
import java.util.Scanner;
class pass{
private int customerId;
int page=0;
Scanner sc=new Scanner(System.in);
int counter=0;
void input(){
    System.out.println("Please Enter your Customer Id");
    customerId=sc.nextInt();
    while(page!=-1){
        System.out.println("Please turn your page");
        counter++;
        page=sc.nextInt();
        
    }
}


public void display(){
    System.out.println("Process Terminated! You have printed totallay "+(counter-1)+" pages");

}



}
public class Assignment2 {
    public static void main(String[] args){
        pass p=new pass();
        p.input();
        p.display();
    }
   

}
