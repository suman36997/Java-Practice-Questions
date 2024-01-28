import java.util.Scanner;

public class Accenture10 {
    public static StringBuffer ans(int num,int n){
        StringBuffer sb=new StringBuffer();
        
        while(num!=0){
            if(num%n<9){
                sb.append(num%n);
            }
            else{
                sb.append((char)(55+num%n));
            }
            num=num/n;
        }
        return sb.reverse();

    }
    public static StringBuffer ans2(int num ,int n,StringBuffer sb){
       
        if(num==0){
            return sb;
        }
        int rem=num%n;
        if(rem<9){
             sb.append(rem);
        }
        else{
            sb.append((char)(55+num%n));
        }
        ans2(num/n,n,sb);
        return sb;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divedend and divisor");
        int num=sc.nextInt();
        int n=sc.nextInt();
        StringBuffer sb=new StringBuffer();
        sb=ans2(num,n,sb);
        System.out.println(sb.reverse());
    }
    
}
