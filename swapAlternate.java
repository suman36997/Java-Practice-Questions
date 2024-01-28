
import java.util.Scanner;


public class swapAlternate {
	public static void Input(int arr[],int size) {
		Scanner s=new Scanner (System.in);
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
	}
	public static void print(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
public static void SwapAlternate(int arr[],int size) {
	if(size%2==0) {
		for(int i=0;i<size;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	else if(size%2!=0) {
		for(int i=0;i<size-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	
}
public static void main(String [] args) {
	System.out.println("Enter the size of array");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int [size];
	Input(arr,size);
	System.out.println("Entered elements are: ");
	print(arr,size);
	System.out.println("Elements after swapping alternate are :");
	SwapAlternate(arr,size);
	print(arr,size);
	
}

}
