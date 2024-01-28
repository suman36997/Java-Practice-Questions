public class Recursion9 {
    public static void printrev(int []arr,int n){
        if(n==0){
            System.out.print(arr[0]);
            return ;
        }
        System.out.print(arr[n]+" ");
        printrev(arr, n-1);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4};
        printrev(arr, arr.length-1);
    }
}
