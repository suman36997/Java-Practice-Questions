import java.util.Collections;

public class Recursion5 {
    // public static void ReverseAnArray(int arr[],int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.print(arr[n-1]+" ");

    //     ReverseAnArray(arr, n-1);
    // }
    public static void ReverseAnArray(int arr[],int i,int n){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        
        ReverseAnArray(arr, i+1, n);
        
    }

    public static void main(String[]args){
        int arr[]={1,2,3,4};
        int n=4;
        
        ReverseAnArray(arr,0, n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
