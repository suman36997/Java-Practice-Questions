import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    // public static void removeDuplicate(String str){
    //     StringBuilder sb=new StringBuilder();
    //     char ch;
    //     int index=-1;
    //     for(int i=0;i<str.length();i++){
    //         ch=str.charAt(i);
    //          index=str.indexOf(ch,i+1);
    //         if(index==-1){
    //             sb.append(ch);
    //         }
    //     }
    //     System.out.print(sb);
    // }

    // public static StringBuilder removeDuplicate1(String str){
    //     char arr[]=str.toCharArray();
    //     StringBuilder sb=new StringBuilder();
    //     for(int i=0;i<str.length();i++){
    //         boolean repeated=false;

    //         for(int j=i+1;j<str.length();j++){
    //             if(arr[i]==arr[j]){
    //                 repeated=true;
    //                 break;
    //             }
    //         }
    //         if(!repeated){
    //             sb.append(arr[i]);
    //         }

    //     }
    //     return sb;
    // }

    public static StringBuffer removeDuplicates(String str){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int idx=str.indexOf(ch,i+1);
            if(idx==-1){
                sb.append(ch);
            }
            if(str.charAt(i)==' '){
                sb.append(" ");
            }

        }
        return sb;

    }

    // public static StringBuilder removeDuplicate2(String str){
    //     Set<Character>set=new LinkedHashSet();
    //     StringBuilder sb=new StringBuilder();
        
    //     for(int i=0;i<str.length();i++){
    //         set.add(str.charAt(i));
    //         }
            

        
    //     for(Character c:set){
    //         sb.append(c);
    //     }
    //     return sb;
    // }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
       StringBuffer sb= removeDuplicates(str);
        System.out.println(sb);
     
        
    }
}
