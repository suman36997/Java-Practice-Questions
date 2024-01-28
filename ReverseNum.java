import java.util.Scanner;
public class ReverseNum {
    public static int reverse(int n){
        int result=0;
        while(n!=0){
            int rem=n%10;
            result=result*10+rem;
            n=n/10;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Enter a no. to find its reverse");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=reverse(n);
        System.out.println("No. after reversing its digit: "+result);
    }
}
