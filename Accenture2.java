import java.util.*;
public class Accenture2 {
    public static int productSmallestPair(int sum,int arr[]){
        Arrays.sort(arr);
        if(arr.length<2){
            return -1;
        }
        if(arr[0]+arr[1]<sum){
            return arr[0]*arr[1];
        }
        else{
            return 0;
        }
    }
    public static void main(String[]args){
        int arr[]={5 ,2 ,4, 3, 9, 7, 1};
        int res=productSmallestPair(9,arr);
        System.out.println(res);
    }
}
