import java.util.Scanner;
public class String4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String to remove its vowels");
    String str=sc.nextLine();
    String ans=str.replaceAll("[aeiou]","");
    System.out.println(ans);
    }
    



}
