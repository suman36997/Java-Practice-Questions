

import java.util.Scanner;


public class SpiralPrint {
	public static void input(int arr[][]) {
		Scanner s=new Scanner(System.in);
		int rows=arr.length;
		int cols=arr[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter element for row "+i+" and col "+j+" ");
				arr[i][j]=s.nextInt();
			}
			
		}
	}
	public static void print(int arr[][]) {
		int rows=arr.length;
		int cols=arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.print("\n");
		}
		
	}
	public static void spiralPrint(int [][]arr) {
		int row=arr.length;
		int col=arr[0].length;
		
		int starting_row=0;
		int starting_col=0;
		int ending_row=row-1;
		int ending_col=col-1;
		int size=(row*col);
		
		
		int count=0;
		while(count<size) {
			for(int i=starting_col;i<=ending_col&&count<size;i++) {
				System.out.print( arr[starting_row][i]+" ");
				
				count++;
			    
			}
			starting_row++;
			for(int i=starting_row;i<=ending_row&&count<size;i++) {
				System.out.print(arr[i][ending_col]+" ");
				
				count++;
			}
			ending_col--;
			for(int i=ending_col;i>=starting_col&&count<size;i--) {
				System.out.print(arr[ending_row][i]+" ");
				
				count++;
			}
			ending_row--;
			for(int i=ending_row;i>=starting_row&&count<size;i--) {
				System.out.print(arr[i][starting_col]+" ");
				
				
				count++;
			}
			starting_col++;
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the rows and cols");
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int cols=s.nextInt();
		int arr[][]=new int[rows][cols];
		input(arr);
		System.out.println("Entered elements are");
		print(arr);
		System.out.println("Spiral print are ");
		spiralPrint(arr);
	}
}
