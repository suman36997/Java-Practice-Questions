import java.util.Scanner;

public class ArmStrongNumber {
    public static int countDigit(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean check(int n){
        int n1=n;
        int ans=0;
        int digit=0;
        int count=countDigit(n);
        while(n!=0){
            digit=n%10;
            ans=ans+(int)(Math.pow(digit,count));
            n=n/10;

        }
        if(ans==n1){
            return true;
        }
        return false;
    }
    public static void printArmStrong(int m ,int n){
        for(int i =m;i<n;i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        // System.out.println("Enter a no. to check ArmStrong");
        // int n = sc.nextInt();
        // if(check(n)){
        //     System.out.println("ArmStrong Number");
        // }
        // else{
        //     System.out.println("Not a ArmStrong Number");
        // }
        System.out.println("Enter a range");
        int m =sc.nextInt();
        int n=sc.nextInt();
        printArmStrong(m, n);
    }
}
