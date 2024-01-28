import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Accenture17 {
    public static int sq(int n){
        int ans=0;
        int digit=0;
        while(n!=0){
            digit=n%10;
            ans=ans+(int)Math.pow(digit,2);
            n=n/10;
        }
        return ans;
    }
    public static boolean check(int num){
        Set<Integer>s=new LinkedHashSet<Integer>();
        int temp=0;
        Boolean ans=true;
        while(num!=1){
            temp=sq(num);
            if(!s.contains(temp)){
                s.add(temp);
            }
            else{
                return false;
            }
            if(num==1){
                break;
            }
            num=temp;
        }
        return ans;
    }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a no. ");
       int num=sc.nextInt();
       boolean ans=check(num);
       System.out.println(ans);
       
    }
}
