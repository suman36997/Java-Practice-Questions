import java.util.Scanner;
public class CalPower {
    public static int power(int base,int pow){
        if(pow==1){
            return base;
        }
        
            int smallPower=pow-1;
            return base*power(base,smallPower);
        
    }
    public static void main(String[] args){
        System.out.println("Enter the base and power");
        Scanner s=new Scanner(System.in);
        int base=s.nextInt();
        int pow=s.nextInt();
        int result=power(base,pow);
        System.out.println("Result is "+result );
    }
    
    
}
