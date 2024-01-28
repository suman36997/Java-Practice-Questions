import java.util.Scanner;
public class Recursion2 {
    public static boolean CheckSorted(int a[]){
        if(a.length<=1){
            return true;
        }
        if(a[0]>a[1]){
            return false;
        }
        int arr[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            arr[i-1]=a[i];
        }
        boolean ans=CheckSorted(arr);
        return ans;
}   public static void main(String[] args){
    System.out.println("Enter the size of array");
    Scanner s=new Scanner(System.in);
    int size=s.nextInt();
    System.out.println("Now enter the elements in array");
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    if(CheckSorted(arr)){
        System.out.println("Entered array is sorted");


    }
    else{
        System.out.println("Entered array is not sorted");
    }
}
}
