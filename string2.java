import java.util.Scanner;
public class string2 {
    public static String ReplaceChar(String str , char ch1 , char ch2){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)==ch1){
            ans=ans+ch2;
        }
        else{
            ans=ans+str.charAt(0);
        }
        String chotaAns=ReplaceChar(str.substring(1),ch1,ch2);
        return ans+chotaAns;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println("Enter which character you want to remove and with whom");

        char ch1=s.next().charAt(0);
        char ch2=s.next().charAt(0);
        String ans=ReplaceChar(str, ch1, ch2);
        System.out.println("Now your string become");
        System.out.println(ans);
        
    }
}
