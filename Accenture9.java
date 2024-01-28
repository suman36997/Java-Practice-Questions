import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Accenture9 {
     public static String MergeTwoString(String str1,String str2){
        
        ArrayList<Character>ar1=new ArrayList<>();
        ArrayList<Character>ar2=new ArrayList<>();
        ArrayList<Character>ar3=new ArrayList<>();
        
        
        
        for(int i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)<=str2.charAt(i)){
                ar1.add(str1.charAt(i));
            }
            else{
                ar2.add(str1.charAt(i));
            }
            if(str1.charAt(i)<str2.charAt(i)){
                ar2.add(str2.charAt(i));
            }
            else{
                ar1.add(str2.charAt(i));
            }
            
        }
        
        
        int k=Math.min(ar1.size(),ar2.size());
        int l=Math.max(str1.length(),str2.length());
        while(k<l){
            if(str1.length()>k){
                ar3.add(str1.charAt(k));
            }
            else{
                ar3.add(str2.charAt(k));
            }
            k++;
        }
         Collections.reverse(ar2);
        ar1.addAll(ar3);
        ar1.addAll(ar2);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ar1.size();i++){
            sb.append(ar1.get(i));
        }
        return sb.toString();


     }
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two string to concate");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String ar=MergeTwoString(str1, str2);
        System.out.println(ar);
     }
}
