
import java.util.Scanner;

public class SelectionSort {
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

public static void selectionSort(int arr[],int size) {
	int min=0;
	for(int i=0;i<size;i++) {
		int min_index=i;
		for(int j=i+1;j<size;j++) {
			if(arr[min_index]>arr[j]) {
				min_index=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min_index];
		arr[min_index]=temp;
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
	selectionSort(arr,size);
	print(arr,size);
	
	
}
}