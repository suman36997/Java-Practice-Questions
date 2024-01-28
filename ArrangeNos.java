

import java.util.Scanner;

public class ArrangeNos {
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
	public static void arrange(int arr[],int size) {
		int first=0;
		int i=0;
		int last=size-1;
		while(first<last) {
			arr[first]=arr[i];
			i++;
			arr[last]=arr[i];
			i++;
			first++;
			last--;
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter the size of array");
		
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		System.out.println("Elements in array are:");
		print(arr,size);
		System.out.println("\n");
		arrange(arr,size);
		System.out.println("Now Elements in array are");
		print(arr,size);
		
	}
}
