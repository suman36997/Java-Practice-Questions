import java.util.Scanner;

public class Recursion13 {
    
    public static Boolean checSort(int num[],int n,int i){
        if(i==n-1){
            return true;
        }
        if(num[i-1]<num[i]&&checSort(num,n,i+1)){
            return true;
        }
        else
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Now Enter the Elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Boolean ans=checSort(arr,n,1);
        if(ans){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Not a sorted array");
        }


    }
}
