import java.util.*;
public class Capegemini {
    public static String Movehashfront(String str){
        String str1="";
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                str1=str1+str.charAt(i);
            }
            else{
                str2=str2+str.charAt(i);
            }
        }
        return str1+str2;
    }
    public static void main(String []args){
        System.out.println("Enter a String to move hash in front");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=Movehashfront(str);
        System.out.println("After moving hash to front "+ans);
    }
}
