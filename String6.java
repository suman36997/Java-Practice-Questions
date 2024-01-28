import java.util.Scanner;
public class String6{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String to remove duplicates");
    String str=sc.nextLine();
    StringBuilder ans=new StringBuilder();
    char []charAr=str.toCharArray();
    for(int i=0;i<str.length();i++){
        boolean reapeated=false;
        for(int j=i+1;j<str.length();j++){
            if(charAr[i]==charAr[j]){
                reapeated=true;
                break;
            }
        }
        if(!reapeated){
            ans.append(charAr[i]);
        }
       
    }
    System.out.println(ans);
    
}
}