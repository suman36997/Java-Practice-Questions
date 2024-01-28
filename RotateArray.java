package ss;

import java.util.Scanner;

public class RotateArray {
	public static void input(int arr[],int size) {
		 Scanner s=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
	}
	public static void print(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	public static void rotateArray(int arr[],int size,int rotation) {
		int temp[]=new int[size];
		for(int i=0;i<size;i++){
	        temp[(i+rotation)%size]=arr[i];
	    }
	    for(int i=0;i<size;i++) {
	    	arr[i]=temp[i];
	    }
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner s=new Scanner (System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		input(arr,size);
		System.out.println("How many times you want to rotate array");
		int rotation=s.nextInt();
		System.out.println("Elements after Rotation");
		rotateArray(arr,size,rotation);
		print(arr,size);
	}
}
