import java.util.Scanner;
public class Recursion3 {
    public static int SumOfArray(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int result=arr[index]+SumOfArray(arr, index+1);
        return result;
    }
    public static void main(String[] args){
        System.out.println("Enter the size of array");
        Scanner s=new Scanner(System.in);
        int  size=s.nextInt();
        System.out.println("Now enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int result=SumOfArray(arr,0);
        System.out.println(result);
    }
}
