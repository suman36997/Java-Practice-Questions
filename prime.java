
import java.util.Scanner;
public class prime {
	public static boolean isPrime(int n) {
		int div=2;
		while(div<=n/2) {
			if(n%div==0) {
				return false;
			}
			div=div+1;
			
			
			
		}
		return true;
		
	}
	public static void main(String args[] ){
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the no. to check it prime or not");
		int n=s.nextInt();
		boolean check=isPrime(n);
		if(check) {
			System.out.println("Given no. is prime");
			
		}
		else {
			System.out.println("Not a Prime no.");
		}
		
		
	}

}
