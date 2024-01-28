import java.util.Scanner;
public class Recursion17 {
    public static void Triangle(int r,int c){
        if(r<0){
            return ;
        }
        if(c<r){
            System.out.print("* ");
         Triangle(r, c+1);

        }
        else{
            System.out.println();
        Triangle(r-1,0);
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column to print print pattern like a tringle");
        int r=sc.nextInt();
        int c=sc.nextInt();
        Triangle(r,c);
    }
}
