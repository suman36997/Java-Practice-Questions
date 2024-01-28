import java.util.Scanner;
public class string5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to remove its white spaces");
        String str=sc.nextLine();
        // "\\s" it represent single space
        String ans=str.replaceAll("\\s","");
        System.out.println(ans);
    }
}
