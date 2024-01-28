
import java.util.Scanner;

public class input {
public static void main(String args[]) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter two nos. to add");
	int a=s.nextInt();
	float b=s.nextFloat();
	float c=a+b;
	System.out.println(c);
//	System.out.println("Now enter strings");
//	String str=s.next();
//	System.out.println(str);
	System.out.println("Again Enter the strings");
	String str1 = s.nextLine();
	System.out.println(str1);
//	char ch=str1.charAt(0);
//	System.out.println(ch);
	
}
}
