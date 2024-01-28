public class Accenture4 {
   static int findCount(int arr[], int length, int num, int diff){
      int count=0;
      for(int i=0;i<length;i++){
        int prb=Math.abs((num-arr[i]));
        if(prb<=diff){
            count++;
        }
      }
      return count;
   }
   public static void main(String[]args){
    int arr[]={12, 3 ,14, 56, 77, 13};
    int ans=findCount(arr,6,13,2);
    System.out.println(ans);
   }
    
}
