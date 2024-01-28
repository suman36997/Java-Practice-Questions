import java.util.Scanner;
public class Recursion1 {
    public static int CalDigit(int n){
        
        if(n==0){
            return 0;
        }
        int small=CalDigit(n/10);
        return small+1;
            
        

    }
    public static void main(String[] args){
        System.out.println("Enter the no. to calculate its digit");
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
        int a=CalDigit(no);
        System.out.println("The no. of digit is "+a );
    }
    
}
