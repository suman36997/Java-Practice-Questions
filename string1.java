import java.util.Scanner;
public class string1 {
    public static String RemoveX(String str){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)!='x'){
            ans=ans+str.charAt(0);
        }
        return ans+RemoveX(str.substring(1));
    } 
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ans=RemoveX(str);
        System.out.println(ans);
    }
}
