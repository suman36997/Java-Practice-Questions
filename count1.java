import java.util.Scanner;

public class count1 {
    public static int count(int n){
        int count=0;
        
        
        while(n!=0){
          
          if((n&1)==1){
            count++;
          }
          n=n>>1;
          System.out.println(n);
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no .");
        int n=sc.nextInt();
        int ans=count(n);
        System.out.println("Ans"+ans);
    }
   
}
