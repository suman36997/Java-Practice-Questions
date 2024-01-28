public class SelectionSort1 {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void selectionsort(int arr[]){
        int min_index=-1;
        for(int i=0;i<arr.length;i++){
            min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            swap(arr,i,min_index);
        }
    }
    public static void main(String[]args){
        int arr[]={4,3,2,1};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
