import java.util.Scanner;

public class CountSquare {
    public static int sumOfsquare(int n){
        if(n<3){
            return n;
        }
        int count=n;
        int x=0;
        int j=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=i*i;
            if(sum>n){
                x=i-1;
                j=n-x*x;
                break;
            }
        }
        count=Math.min(count,sumOfsquare(j)+1);
        return count;
    }

        public static void main(String[]args){
            System.out.println("Enter a no. to find its countSquare");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int ans=sumOfsquare(n);
            System.out.println(ans);
            
            
        }
}
