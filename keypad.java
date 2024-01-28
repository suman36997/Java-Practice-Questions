import java.util.Scanner;
import java.lang.String;
public class keypad {
    public static String[] helper(int n){
      
        if(n==1){
            String []output={"a","b","c"};
            return output;
        }
        else if(n==2){
            String []output={"d","e","f"};
            return output;
        }
        else if(n==3){
            String []output={"g","h","i"};
            return output;
        }
         else if(n==4){
            String []output={"j","k","l"};
            return output;
        }
        else if(n==5){
            String []output={"m","n","o"};
            return output;
        }
        else if(n==6){
            String []output={"p","q","r"};
            return output;
        }
        else if(n==7){
            String []output={"s","t","u"};
            return output;
        }
        else if(n==8){
            String []output={"v","w","x"};
            return output;
        }
        else {
            String []output={"y","z","@"};
            return output;
        }
        
    }
    public static String[]findsubsequences(int n1){
        if(n1==0){
            String []ans={""};
            return ans;
        }
        
        String[] smallans=findsubsequences(n1/10);
        String []SingleDigit=helper(n1%10);
        String []ans=new String[SingleDigit.length*smallans.length];
        int k=0;
        for(int i=0;i<SingleDigit.length;i++){
            for(int j=0;j<smallans.length;j++){
                ans[k]=smallans[j]+SingleDigit[i];
                k++;
            }
        }
        
        return ans;

    }
    public static void main(String[] args){
        System.out.println("Enter the digit to find its relative keypad combination");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String []str=findsubsequences(n);
        int count=0;
        for(int i=0;i<str.length;i++){
        System.out.println(str[i]);
            count++;
        }
        System.out.println(count);
    }
}
