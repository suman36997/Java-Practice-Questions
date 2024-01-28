
import java.util.Scanner;
public class ArrayAssignment {
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
public static void print0(int arr[],int size) {
	int arr1[]=new int[size];
	int k=0;
	for(int i=0;i<size;i++) {
		if(arr[i]!=0) {
			arr1[k]=arr[i];
			k++;
		}
		
	}
	for(int i=0;i<size;i++) {
		arr[i]=arr1[i];
	}
	
}
public static void main(String[] args) {
	System.out.println("Enter the size of array");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements of array");
	input(arr,size);
	print0(arr,size);
	System.out.println("New Elements are");
	print(arr,size);
}
}
