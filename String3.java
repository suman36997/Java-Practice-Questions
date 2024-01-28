import java.util.Scanner;
public class String3 {
    // public static void removSpecialChrac(String str){
        
        
    //     String ans=str.replaceAll(" [^a-zA-Z0-9]", "");
    //     System.out.println(ans);
    // }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string with special character");
        String str=sc.nextLine();
        String ans=str.replaceAll("[^a-zA-Z0-9]","");
        
        
        
        System.out.println(ans);
        
    }
}
