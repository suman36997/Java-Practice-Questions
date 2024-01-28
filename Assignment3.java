import java.util.Scanner;
class Choose{
    int flipkart;
    int amazon;
    int snapdeal;
    void takeInput(){
        Scanner sc=new Scanner(System.in);
         flipkart=sc.nextInt();
         amazon=sc.nextInt();
         snapdeal=sc.nextInt();
    }
    void comp(String name){
        if(flipkart<0 || amazon<0 || snapdeal<0){
            System.out.println("Invalid input");
        }
        else if(flipkart<amazon && flipkart<snapdeal){
            System.out.println("Buy "+name+" from flipkart");
        }
        else if(amazon<flipkart && amazon<snapdeal){
            System.out.println("Buy "+name+" from Amazon");

        
        }
        else{
            System.out.println("Buy "+name+" from Snapdeal");

        }
    }
}
public class Assignment3 {
    public static void main(String []args){
        Choose c1=new Choose();
        Choose c2=new Choose();
        Choose c3=new Choose();
        Choose c4=new Choose();
        Choose c5=new Choose();

        c1.takeInput();
        c2.takeInput();
        c3.takeInput();
        c4.takeInput();
        c5.takeInput();
        c1.comp("mobile");
        c2.comp("laptop");
        c3.comp("speakers");
        c4.comp("powerbank");
        c5.comp("usb");
        
    }
    
}
