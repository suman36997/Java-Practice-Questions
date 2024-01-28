package ss;
import java.util.Scanner;

public class ReverseString {
	public static String Reverse(String str) {
		
		int end=str.length();
		int i=str.length()-1;
		String result="";
		while(i>=0) {
			
			if(str.charAt(i)==' ') {
				result= result + str.substring(i+1,end)+" ";
				
				
				end=i;
			}
			i--;
		}
		result = result+str.substring(i+1,end)+" ";
		return result;
		
	}
public static void main(String [] args) {
	System.out.println("Enter a stirng to find its reverse");
//	Scanner s=new Scanner(System.in);
//	String str=s.next();
//	String str1=Reverse(str);
	String  str1="hi i am suman saurav";
	str1=Reverse(str1);
	System.out.print(str1);
	
	
}
}
