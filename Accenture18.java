import java.util.Scanner;

class Accenture18{
    public static int  count(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean check(int n){
        int temp=n;
        boolean ans=true;
        for(int i=0;i<count(n);i++){
            int digit=temp%10;
            if(digit ==1 || digit ==4 || digit ==9){
                temp=temp/10;

                continue;

            }
            else{
                ans=false;
                break;
            }
            
        }
        return ans;
    }
    public static int countDigit(int m,int n){
        int count=0;
        
        for(int i=m;i<n;i++){
            boolean ans=check(i);
            if(ans){
                count++;
                System.out.print(i+" ");
            }
        }
        return count;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans=countDigit(m, n);
        System.out.println(ans);
    }
}