import java.util.Scanner;

public class StairCasePrb {
    public static int StairCase(int n){
        if(n==1|| n==2){
            return n;
        }
        return StairCase(n-1)+StairCase(n-2);
    }
    public static void main(String []args){
        System.out.println("Enter the value of n");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int ans=StairCase(n);
        System.out.println(ans);
    }
}
