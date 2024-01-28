
import java.util.Scanner;
public class AllEvenVallue {
	public static void Even(int n) {
		for(int i=0;i<n;i+=2) {
			System.out.print(i+" ");
		}
	}
	public static void main(String args []) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		Even(n);
		
	}
	
}
