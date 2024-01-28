public class RotateArrayOptime {
    public static void reverse(int arr[],int s,int e){
        
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void rotateLeft(int arr[],int k){
         if(k>arr.length){
            k=k%arr.length;
         }
        
            reverse(arr,0,k-1);
        
        reverse(arr,k,arr.length-1);
        reverse(arr, 0, arr.length-1);
        
        
        
               

    }
    public static void rotateRight(int arr[],int k){
        if(k>arr.length){
            k=k%arr.length;
         }
        reverse(arr,0,arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};

        rotateLeft(arr, 20);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
