import java.util.Scanner;

public class Recursion10 {
    public static int sumOfDigit(int num){
        if(num<9){
            return num;
        }
        return num%10+sumOfDigit(num/10);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. to find its digit sum");
        int num=sc.nextInt();
        int ans=sumOfDigit(num);
        System.out.println(ans);
    }
}
