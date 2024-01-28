import java.util.Scanner;

public class Recursion18 {
    public static void BubbleSortUsingRec(int arr[],int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            if(arr[c]<arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            BubbleSortUsingRec(arr, r, c+1);
        }
        else{
            BubbleSortUsingRec(arr, r-1, 0);
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,3,2,1};
        BubbleSortUsingRec(arr, 3, 0);
        System.out.println("Elements of array after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
