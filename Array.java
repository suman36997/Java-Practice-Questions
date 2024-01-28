public class Array {
    public static void rotateKelementLeft(int []arr,int k){
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
    }
    public static void rotateKelementLeft2(int []arr,int k){
        k=k%arr.length;
        int temp[]=new int [k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-(k)]=arr[i];
        }
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            // arr[i]=temp[i-(arr.length-k)];
            arr[i]=temp[j];
            j++;
        }
    }
    public static void main(String[]args){
        // int arr[]={1,2,3,4,5,6,7};
        // int k=2;
        // rotateKelementLeft(arr,k);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int arr1[]={1,2,3,4,5};
        int k1=2;
        rotateKelementLeft(arr1,k1);
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
