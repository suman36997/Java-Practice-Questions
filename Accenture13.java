import java.util.Scanner;

public class Accenture13 {
    public static int countSuqare(int n){
        if(n<3){
            return n;
        }
        int sum=0;
        int count=n;
        
        int x=0;
        int k=0;
        // int count=0;
        for(int i=1;i<n;i++){
            sum=i*i;
            if(sum>n){
                k=i-1;
                x=n-k*k;
                break;
            }
        }
         count=Math.min(count,countSuqare(x)+1);
        return  count;

    }
    public static int countSquare2(int n,int count){
        if(n<3){
            return count+n;
        }
        int sum=0;
        int k=0;
        int x=0;
        for(int i=1;i<n;i++){
            sum=i*i;
            if(sum>n){
                k=i-1;
                x=n-k*k;
                break;
            }
        }
        return countSquare2(x, count+1);


    }
    public static int countSquare3(int n,int count){
        int sq=0;
        int k=0;
        int x=0;
       while(n!=0){
        sq=0;
        k=0;
        x=0;
        for(int i=1;i<n;i++){
            sq=i*i;
            if(sq>n){
                k=i-1;
                x=n-k*k;
                break;
            }
        }
        if(n<3){
            return count+n;
        }
        else{
            count++;

        }
        n=x;
       }
       return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. ");
        int num=sc.nextInt();
        int ans=countSquare3(num,0);
        System.out.println(ans);
        
    }
}
