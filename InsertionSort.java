

import java.util.Scanner;

public class InsertionSort {
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
	public static void insertionSort(int arr[],int size) {
		
		for(int i=1;i<size;i++) {
			int j;
			int temp=arr[i];
			for( j=i-1;j>=0;j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner s=new Scanner (System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		input(arr,size);
		
		System.out.println("Elements after sorting using selection sort");
		insertionSort(arr,size);
		print(arr,size);
		
	}
}
