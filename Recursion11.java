import java.util.Scanner;

public class Recursion11 {
    public static int countDigit(int nums){
        int count=-1;
        while(nums!=0){
            count++;
            nums=nums/10;
        }
        return count;
    }
    public static int reverseRec(int nums){
        int count=countDigit(nums);
        if(nums<9){
            return nums;
        }
        return (nums%10)*(int)Math.pow(10,count) + reverseRec(nums/10);
    }
   static int sum=0;
    public static void reverseRec2(int nums){
        
        if(nums==0){
            return ;
        }
        sum=sum*10+nums%10;
        reverseRec(nums/10);
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  no. to reverser its digit recursively");
        int num=sc.nextInt();
        int ans=reverseRec(num);
        reverseRec2(num);
        System.out.println(sum);

        System.out.println(ans);
    }

}
