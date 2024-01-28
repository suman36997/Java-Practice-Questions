import java.util.Scanner;

public class Recursion12 {
    static int count1=0;
    public static void countZero(int num){
        if(num==0){
            return;
        }
        if(num%10==0){
            count1++;
        }
        countZero(num/10);
    }

    // Method 2
    public static int helper(int num,int count){
        if(num==0){
            return count;
        }
        if(num%10==0){
            return helper(num/10, count+1);
        }
        
            return helper(num/10,count);
        
    }
    public static int countZero1(int num){
        return helper(num,0);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. to count its digit as zero");
        int num=sc.nextInt();
        countZero(num);
        System.out.println(count1);
        int ans=countZero1(num);
        System.out.println(ans);
        
    }
}
