import java.util.Scanner;

public class CheckPrime {
    public static boolean check(int num){
        if(num==2){
            return true;
        }
        if(num==0||num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimeIndices(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(check(i)){
                ans=ans+arr[i];
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. to check prime");
        int n=sc.nextInt();
        boolean ans=check(n);
        if(ans){
            System.out.println("Prime no.");
        }
        else{
            System.out.println("Not a prime no");
        }
        int arr[]={1,2,3,4,5};
        int ans1=sumOfPrimeIndices(arr);
        System.out.println(ans1);
    }
}
