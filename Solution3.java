import java.util.Scanner;
class Solution3 {
    public static char returnCarry(char ch1,char ch2){
        if((ch1=='0' && ch2=='1')|| (ch1=='1'&& ch2=='0')||(ch1=='0' && ch2=='0')){
            return '0';
        }
        
        else{
            return '1';
        }
    }
    public  static char returnSum(char ch1,char ch2){
        if((ch1=='0' && ch2=='1')|| (ch1=='1'&&ch2=='0')){
            return '1';
        }
        else{
            return '0';
        }
    }
    public static String addBinary(String a, String b) {
        String ans="";
        int n1=a.length();
        int n2=b.length();
        char carry='0';
        char sum='0';
        char ch1='0';
        char ch2='0';
        char sum1='0';
        
        while(n1!=0 && n2!=0){

            // System.out.print(n2+" ");
           
                ch1=a.charAt(n1-1);
            ch2=b.charAt(n2-1);
            sum=returnSum(ch1,ch2);
            sum1=returnSum(ch1, ch2);
            

            if(carry=='0'){
                ans=sum+ans;
            }
             
            else{
                sum=returnSum(carry,sum);
                ans=sum+ans;
                
            }
            
          System.out.println(sum1+" "+carry);

          if(sum1=='1' && carry=='1'){
                carry='1';
                
            }
            else{
                    carry=returnCarry(ch1,ch2);

            }
            
          
             
            
            // System.out.print(carry);


            n1--;
            n2--;
        }
        // if(n1!=0){
        //     n1=n1-1;
        // }
        // if(n2!=0){
        //     n2=n2-1;
        // }
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(carry);

        while(n1!=0){
            ch1=a.charAt(n1-1);
            if(carry=='1'){
                sum=returnSum(carry,ch1);
                ans=sum+ans;
            }
            else{
                ans=ch1+ans;

            }
            
                          

           
                carry=returnCarry(carry, ch1);
            

            n1--;
            
        }
        while(n2!=0){
            ch2=b.charAt(n2-1);
            if(carry=='1'){
                sum=returnSum(carry,ch2);
                ans=sum+ans;
            }
            else{
                ans=ch2+ans;

            }
           
            
                carry=returnCarry(carry, ch2);
            
            n2--;
            
        }
        if(carry=='1'){
            
            ans='1'+ans;
        return ans;

        }
        return ans;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String ans=addBinary(str1, str2);
        System.out.println(ans);
    }
}