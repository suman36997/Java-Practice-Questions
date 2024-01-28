import java.util.Scanner;
public class Recursion4 {
    public static boolean CheckSortedBetter(int arr[],int startIndex){
        if(startIndex>=arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }
        boolean result=CheckSortedBetter(arr, startIndex+1);
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        System.out.println("Now enter the elements of array");
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        if(CheckSortedBetter(arr, 0)){
            System.out.println("you entered a sorted array");

        }
        else{
            System.err.println("Array is not sorted");
        }
    }
}
