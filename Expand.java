import java.util.Scanner;

public class Expand {
    public static String expand(String str){
        String ans="";
        int temp=str.length();
        for(int i=0;i<str.length();i++){
        int temp2=(int)Math.pow(10,temp-1);
        int temp3=(int)(str.charAt(i))-48;
        ans=ans.concat(Integer.toString(temp3*temp2))+"+";
        temp--;
    }
        return ans;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no to see in expanded form");
        String str=sc.nextLine();
        System.out.println("In expanded form "+"\n"+expand(str));
    }
}
