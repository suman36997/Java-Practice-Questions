import java.util.ArrayList;
import java.util.Scanner;

public class Recursion21 {
    public static void printSubsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        printSubsequence(p+ch, up.substring(1));
        printSubsequence(p, up.substring(1));
    }
    public static ArrayList<String>printSubsequence1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
       ArrayList<String>left= printSubsequence1(p+ch, up.substring(1));
       ArrayList<String>right= printSubsequence1(p, up.substring(1));
       left.addAll(right);
       return left;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to print its subsequences");
        String str=sc.nextLine();
        printSubsequence("", str);
        System.out.println(printSubsequence1("", str));


    }
}
