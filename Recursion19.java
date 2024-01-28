public class Recursion19 {
    public static void SelectionSort(int arr[],int r,int c,int max){
        if(r==0){
            return;
        }
        // int min_index=r;
        if(c<r){
            if(arr[max]<arr[c]){
            SelectionSort(arr, r, c+1,c);

            }
            else{
                SelectionSort(arr, r, c+1,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            SelectionSort(arr, r-1, 0,0);
        }
    }
    public static void main(String[]args){
        int arr[]={4,3,2,1};
        SelectionSort(arr, 4, 0,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
