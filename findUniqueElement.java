

import java.util.Scanner;

public class findUniqueElement {
	public static void takeInput(int arr[],int size) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
	}
	public static void printArray(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int unique(int arr[],int size) {
		int result=0;
		for(int i=0;i<size;i++) {
			result=result^arr[i];
		}
		return result;
	}
	public static void main(String args[]) {
		System.out.println("Enter the size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		takeInput(arr,size);
		System.out.println("Your element in array is");
		printArray(arr,size);
		System.out.println("\n");
		int result=unique(arr,size);
		System.out.println("Unique element is  "+ result);
	}


}
