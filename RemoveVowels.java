import java.util.Scanner;

public class RemoveVowels {
    public static String remove(String str){
        
        return str.replaceAll("[aeiouAEIOU]","");

    }
    public static void main(String []args){
        System.out.println("Enter a stirng to remove its vowels");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(remove(str));
    }
}
