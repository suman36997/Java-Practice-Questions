 import java.util.Scanner;
public class String8 {
    public static int findmax(int a){
        int ans=Integer.MIN_VALUE;

        int digit=0;
        while(a!=0){
            digit=a%10;
            if(digit>ans){
                ans=digit;
            }
            else{
                a=a/10;
            }
        }
        return ans;
    }
    public static int fun(String str){
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                int b=str.charAt(i)-48;
                ans=ans+(b);
            }
            else{
               int a= (int)(str.charAt(i));
               
               ans=ans+findmax(a);
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a string to find its price");
        String str=Sc.nextLine();
        int ans=fun(str);
        System.out.println("Your price of the item is "+ans);
    }
}
