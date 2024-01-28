package ss;
import java.util.Scanner;
public class BinaryToDecimal {
public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a Binary no. to convert it into decimal");
	long  a = s.nextLong();
	int sum=0;
	int rem=0;
	int count=0;
	while(a>0) {
		rem=(int)a%10;
		sum=sum+(int)(rem*Math.pow(2,count));
		a=a/10;
		count++;
	}
	System.out.println("Your required decimal no. is ");
	System.out.println(sum);
}

}
