import java.util.ArrayList;
import java.util.Arrays;

public class Accenture6 {
   static int LargeSmallSum(int[]arr){
        Arrays.sort(arr);
        
        ArrayList<Integer>even=new ArrayList<>();       
         ArrayList<Integer>odd=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
         }
         return (even.get(even.size()-2)+odd.get(1));

   }
   public static void main(String[]args){
    int arr[]={1, 8, 0, 2, 3, 5, 6};
    int ans=LargeSmallSum(arr);
    System.out.println();
    System.out.println(ans);
   }
}
