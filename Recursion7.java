public class Recursion7 {
    public static int binarySearch(int arr[],int target,int s,int e){
        if(s>=e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
       else if(arr[m]>target){
           return binarySearch(arr, target, s, m-1);
        }
       
        else{
              return  binarySearch(arr, target, m+1, e);
           }

        
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,67};
        int target=3;
        int ans=binarySearch(arr, target, 0,arr.length-1);
        System.out.println(ans);
    }
}
