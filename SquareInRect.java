
    import java.util.Scanner;

class SquareInRect{
    
    public static int CountSquare(int l,int b){
        int max=1;
        int ar=l*b;
        if(l%b==0){
            return l/b;
        }
        else{
            for(int i=1;i<b;i++){
                if(l%i==0 && b%i==0)
                max=Math.max(max,i);
            }
            return ar/(max*max);

        }

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");

        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(CountSquare(l, b));
    }
}

