import java.util.Scanner;
public class Recursion {
    public  static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args){
        System.out.println("Enter the no. to print");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        print(a);
    }
}
