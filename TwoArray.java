package ss;
import java.util.Scanner;
public class TwoArray {
public static void WavePrint(int [][]arr) {
	int rows=arr.length;
	int cols=arr[0].length;
	
	for(int i=0;i<cols;i++) {
		
			if(i%2==0) {
				for(int j=0;j<rows;j++) {
					System.out.print(arr[j][i]+" ");
					
				}
				}
				if(i%2!=0) {
					for(int j=rows-1;j>=0;j--) {
						System.out.print(arr[j][i]+" ");
					}
				}
				System.out.print("\n");
			
			
		
	}
}
public static void main(String[] args) {
	System.out.println("Enter the no. of rows and cols");
	Scanner s=new Scanner(System.in);
	int rows=s.nextInt();
	int cols=s.nextInt();
	int arr[][]=new int[rows][cols];
    for(int i=0;i<rows;i++) {
    	for(int j=0;j<cols;j++) {
    		System.out.print("Enter the element for "+i+" row and "+j+" col");
    		arr[i][j]=s.nextInt();
    	}
    }
    System.out.println("Entered elements are");
    for(int i=0;i<rows;i++) {
    	for(int j=0;j<cols;j++) {
    		System.out.print(arr[i][j]+" ");
    	}
    	System.out.println("\n");
    }
    System.out.println("Elements in wave print");
    WavePrint(arr);
	
	
	
}
}
