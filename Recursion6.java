import java.util.Scanner;

public class Recursion6 {
    public static  boolean checkPalidrome(String str,int i){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
       return checkPalidrome(str,  i+1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        
        boolean ans=checkPalidrome(str,  1);
        if(ans){
            System.out.println("Valid palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
