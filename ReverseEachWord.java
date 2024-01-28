
import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWord {
    static String Reverse(String str,int n){
       
        String ans="";
        
        for(int i=0;i<n;i++){
            ans=str.charAt(i)+ans;
        }
        return ans;
    }
    // static String ReverseSentence(String str){
    //     Stack<Character> st=new Stack<>();
    //     StringBuilder sb=new StringBuilder();
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)!=' '){
    //             st.push(str.charAt(i));
    //         }
    //         else{
    //             while(!st.isEmpty()){
    //                 sb.append(st.pop());
    //             }
    //             sb.append(' ');
    //         }
    //     }
    //     while(!st.isEmpty()){
    //         sb.append(st.pop());
    //     }
    //     return sb.toString();

    // }
    static void ReverseSentence(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        String[] arr=rev.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    static void ReverseSentence2(String str){
        String arr[]=str.split(" ");
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    // static String ReverseSentence(String str){
    //     // int i=0;
    //     // int j=str.length();
    //     // int count=1;
    //     Stack<Character> s=new Stack<>();
    //     StringBuilder ans=new StringBuilder();
    //     for(int i=0;i<str.length();i++){

        
    //         // count=0;
    //         if(str.charAt(i)==' '){
    //             // System.out.print(str.charAt(i));
    //             while(!s.isEmpty()){
    //                 ans.append(s.pop());
    //             }
    //             ans.append(' ');

    //         }
    //         else{
    //             s.push(str.charAt(i));
    //         }
           
    //           while(!s.isEmpty()){
    //             ans.append(s.pop());
    //           }
           

    //     }
        
    //     return ans.toString();
        
    // }
    // HashSet<Character>map=new HashSet<>();
    //     char[]ch=str.toCharArray();
    //     for(char x:ch){
    //         map.add(x);
    //     }
            
        
    //     for(char x:map){
    //         System.out.print(x);
    //     }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        // str=Reverse(str, 5);
        // String str1=ReverseSentence(str);
        ReverseSentence(str);
        System.out.println();
         ReverseSentence2(str);
        // System.out.println(str1);
        
    }
}
