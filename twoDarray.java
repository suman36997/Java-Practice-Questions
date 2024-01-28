package ss;
import java.util.Scanner;
public class twoDarray {
public static int printLargestSum(int [][] arr) {
	int row=arr.length;
	int col=arr[0].length;
	int result=0;
	for(int i=0;i<row;i++) {
		int sum=0;
		for(int j=0;j<col;j++) {
			
			sum=sum+arr[i][j];
		}
		if(result<sum) {
			result=sum;
		}
	}
	return result;
}
public static void main(String[] args) {
	System.out.println("Enter the no. of rows and col");
	Scanner s=new Scanner(System.in);
	int rows=s.nextInt();
	int cols=s.nextInt();
	int arr[][]=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.println("The element for "+i+ " row and "+j+" col");
			arr[i][j]=s.nextInt();
		}
	}
	System.out.println("Your inputed 2D array is ");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.print("\n");
	}
	int result=printLargestSum(arr);
	
	System.out.println("The largest sum of col is "+result);
}
}
