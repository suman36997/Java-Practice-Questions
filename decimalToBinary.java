
import java.util.Scanner;


public class decimalToBinary {
public static void main(String args []) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no. to convert it into binary");
	int a=s.nextInt();
	int sum=0;
	int count=0;
	while(a>0) {
		int rem=a%2;
		sum=sum+(int)(rem*(Math.pow(10,count)));
		a=a/2;
		count++;
	}
	System.out.println("Your binary no. is");
	System.out.println(sum);
}
}
