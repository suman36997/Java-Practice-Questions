
import java.util.Scanner;

public class findDuplicate {
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
	public static void duplicate(int arr[],int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j < size;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					
					
				}
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		System.out.println("Elements entered by you is ");
		print(arr,size);
		System.out.println("\n");
		System.out.println("Duplicates Elements are");
		duplicate(arr,size);
		
		
		

	}

}
