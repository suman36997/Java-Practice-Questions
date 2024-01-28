import java.util.Arrays;

public class Accenture7 {
    static int ProductSmallestPair(int sum, int []arr){
        Arrays.sort(arr);
        if(arr[0]+arr[1]<=sum){
            return arr[0]*arr[1];
        }
        else
        return 0;
    }
    public static void main(String[]args){
        int arr[]={9 ,8 ,3 ,-7, 3, 9};
        int ans=ProductSmallestPair(9, arr);
        System.out.println(ans);
    }
}
