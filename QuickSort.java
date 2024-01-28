import java.util.Scanner;

public class QuickSort {
    public static  int partition(int [] arr ,int s,int e){
        
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[s]>=arr[i]){
                count++;
            }
        }
        
        int temp=arr[s];
        arr[s]=arr[s+count];
        arr[s+count]=temp;
        int i=s;
        int j=e;
        int k=s+count;
        while(i<k && j>k){
            while(arr[i]<arr[k]){
                i++;
            }
            while(arr[j]>arr[k]){
                j--;
            }
            if(i<k && j>k){
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
            i++;
            j--;
            }
            

        }
        return k;
    }
    public static void quickSort(int []arr,int s,int e){
        if(arr.length<=1){
            return;
        }
        if(s>=e){
            return;
        }
        int pivot=partition(arr, s, e);

        quickSort(arr, s,pivot-1);
        quickSort(arr, pivot+1,e);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        System.out.println("Now enter the elements of array");
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        quickSort(arr, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        int k=partition(arr,0,size-1);
        System.out.println(k);
    }
}
