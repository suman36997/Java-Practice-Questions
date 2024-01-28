

import java.util.Scanner;

public class findMax {
	public static void input(int arr[],int size) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
	}
	public static void print(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static int max(int arr[],int size) {
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(maxi<arr[i]) {
				maxi=arr[i];
			}
		}
		return maxi;
	}

public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=s.nextInt();
	int arr[]=new int[size];
	input(arr,size);
	System.out.println("Elements in array are:");
	print(arr,size);
	System.out.println("\n");
	
	int maxi=max(arr,size);
	System.out.println("Largest element of array is : "+ maxi);
	
	
}
}
