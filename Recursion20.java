import java.util.Scanner;

public class Recursion20 {
    static StringBuffer sb=new StringBuffer();
    // public static StringBuffer RemoveARec(String str,int index){
        
    //     if(str.length()==index){
    //         return sb ;
    //     }
    //     if(str.charAt(index)!='a'){
    //         sb.append(str.charAt(index));
    //     }
        
    //     return RemoveARec(str ,index+1);
    // }
    public static String RemoveApple(String str){
        
        if(str.isEmpty()){
            return " ";
        }
       
        if(str.startsWith("apple")){
           return RemoveApple(str.substring(5));
        }
        else{
            return str.charAt(0)+RemoveApple(str.substring(1));
        }
        
             


        
    }
    public static String RemoveAppNotApple(String str){
        
        if(str.isEmpty()){
            return " ";
        }
       
        if((str.startsWith("app")) && (!str.startsWith("apple"))){
           return RemoveApple(str.substring(3));
        }
        else{
            return str.charAt(0)+RemoveApple(str.substring(1));
        }
        
             


        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // StringBuffer sb=new StringBuffer();
        System.out.println("Enter a string to remove a form String rec");
        String str=sc.nextLine();
    //    StringBuffer sb1=RemoveARec(str,0);
    //    String sb2=RemoveApple(str);
    //     System.out.println(sb2);
        String sb3=RemoveAppNotApple(str);
        System.out.println(sb3);
    }
}
