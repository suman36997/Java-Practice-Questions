public class Recursion16 {
   public static int BinarySearchInRotatedArrayRec(int arr[],int target,int s,int e){
    if(s>e){
        return -1;
    }
    int mid=s+(e-s)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(arr[s]<arr[mid]){
        if(arr[s]<target&&arr[mid]>target){
            return BinarySearchInRotatedArrayRec(arr, target, s, mid-1);
        }
        else{
            return BinarySearchInRotatedArrayRec(arr, target, mid+1, e);
        }
    }
    
        if(target>arr[mid]&&target<arr[e]){
            return BinarySearchInRotatedArrayRec(arr, target, mid+1, e);
      }
      else{
        return BinarySearchInRotatedArrayRec(arr, target, s, mid-1);
      }
        
        
   } 
   public static void main(String[]args){
    int arr[]={5,6,7,8,9,1,2,3};
    int ans=BinarySearchInRotatedArrayRec(arr, 9, 0, arr.length-1);
    System.out.println(ans);

   }
}
