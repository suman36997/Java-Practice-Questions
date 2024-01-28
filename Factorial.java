
import java.util.Scanner;


public class Factorial {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=s.nextInt();
	System.out.println("Enter the value of r");
	int r=s.nextInt();
	double result=factorial(n)/(factorial(r)*factorial(n-r));
	System.out.println("Your value of combination is ");
	System.out.println(result);
}
}
