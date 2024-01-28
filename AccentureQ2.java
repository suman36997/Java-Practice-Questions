import java.util.Scanner;

public class AccentureQ2 {
   static int OperationsBinaryString(String str){
        if(str.length()==0){
            return -1;
        }
        int ans=str.charAt(0)-'0';
        for(int i=1;i<str.length();){
            int prev=str.charAt(i);
            i++;
            if(prev=='A'){
                ans= ans & (str.charAt(i)-'0');
            }
            else if(prev=='B'){
                ans= ans | (str.charAt(i)-'0');
            }
            else
                ans= ans ^ (str.charAt(i)-'0');
            i++;
            
            

        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        int ans=OperationsBinaryString(str);
        System.out.println(ans);
    }
}
