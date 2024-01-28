import java.util.Arrays;

public class Accentrure14 {
 public static int findMinDiff(int arr[],int n,int m){
    int ans=Integer.MAX_VALUE;
    Arrays.sort(arr);
    int k=m;
    for(int i=0;i<n;i++){
        if(k<n){
            ans=Math.min(ans, arr[k-1]-arr[i]);
           k++;
        
        }
    }
    return ans;
 }   
 public static void main(String[]args){
    int n=7;
    int arr[]={7,3,2,4,9,12,56};
    int m=3;
    int ans=findMinDiff(arr, n, m);
    System.out.println(ans);
 }
}
