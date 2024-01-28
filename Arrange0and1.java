

import java.util.Scanner;

public class Arrange0and1 {
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
public static void sort0and1(int arr[],int size) {
	int i=0;
	int j=size-1;
	while(i<j) {
		while(arr[i]==0) {
			i++;
		}
		while(arr[j]==1) {
			j--;
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
public static void main(String [] args) {
	System.out.println("Enter the size of array");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	input(arr,size);
	System.out.println("Elements after rearranging 0 and 1: ");
	sort0and1(arr,size);
	print(arr,size);
}
}
