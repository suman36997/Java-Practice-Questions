public class Recursion14 {
    public static boolean LinearSearchRec(int arr[],int index,int target){
        if(index==arr.length-1){
            return false;
        }
        if(target==arr[index]){
            return true;
        }
        else{
            return LinearSearchRec(arr, index+1, target);

        }
        
        
    }
    public static void main(String[]args){
        int arr[]={1,2,4,5,18,10,9};
        boolean ans=LinearSearchRec(arr, 0, 189);
        System.out.println(ans);
    }
}
