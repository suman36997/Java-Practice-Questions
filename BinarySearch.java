
import java.util.Scanner;
public class BinarySearch {
public static int binarySearch(int arr[],int size,int element) {
	int s=0;
	int e=size-1;
	int mid=0;
	while(s<e) {
		 mid=(s+e)/2;
		if(element>arr[mid]) {
			s=mid+1;
		}
		else if(element<arr[mid]) {
			e=mid-1;
		}
		
		
	}
	return mid;
}
public static void input(int arr[],int size) {
	Scanner s=new Scanner(System.in);
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
	}
}
public static void print(int arr[],int size) {
	for(int i=0;i<size;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.print("\n");
}
public static void main(String [] args) {
	System.out.println("Enter the size of array");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the array elements");
	input(arr,size);
	System.out.println("Now enter the elements you want to search");
	
	int element=s.nextInt();
	System.out.println("The element present at the index no. ");
	int mid=binarySearch(arr,size,element);
	System.out.print(mid-1);
}

}
