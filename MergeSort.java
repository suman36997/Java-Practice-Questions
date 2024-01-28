import java.util.Scanner;
public class MergeSort {
public static void  merge(int []arr,int s,int e){
    int mid=(s+e)/2;
    int len1=mid-s+1;
    int len2=e-mid;
    int []arr1=new int[len1];
    int []arr2=new int [len2];
    int k=s;
    for(int i=0;i<len1;i++){
        arr1[i]=arr[k++];
    }
    int m=mid+1;
    for(int i=0;i<len2;i++){
        arr2[i]=arr[m++];
        
    }
    
    int i=0;
    int j=0;
     k=s;
    while(i<len1 && j<len2){
        if(arr1[i]<arr2[j]){
            arr[k++]=arr1[i++];
        }
        else if(arr2[j]<arr1[i]){
            arr[k++]=arr2[j++];
        }
    }
    while(i<len1){
        arr[k++]=arr1[i++];
    }
    while(j<len2){
        arr[k++]=arr2[j++];
    }
    
    
}
    public static void Merge_Sort(int []arr,int s,int e){
        if(arr.length<=1){
            return;
        }
        if(s>=e){
            return ;
        }
        int mid=(s+e)/2;
        Merge_Sort(arr, s, mid);
        Merge_Sort(arr, mid+1, e);
        merge(arr,s,e);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        System.out.println("Now enter the elements of array to sort it using merge sort");
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int st=0;
        Merge_Sort(arr,st,size-1);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
