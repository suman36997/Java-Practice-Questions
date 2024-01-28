import java.util.Scanner;
public class ReturnSubsequences {
    public static String []findsubsequences(String str){
        if(str.length()==0){
            String []ans={" "};
            return ans;
        }
        String smallans[]=findsubsequences(str.substring(1));
        String ans[]=new String[2*smallans.length];
        for(int i=0;i<smallans.length;i++){
            ans[i]=smallans[i];
        }
        for(int i=0;i<smallans.length;i++){
            ans[i+smallans.length]=str.charAt(0)+smallans[i];
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Enter the string to find its subsequences");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String []str1=findsubsequences(str);
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }



 
    }
}
