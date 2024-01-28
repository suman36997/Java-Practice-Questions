import java.util.Scanner;

public class FindHcf {
    public static int findMin(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        
        return min;
    }
    public static int find(int arr[]){
        int ans=0;
        boolean k=true;
        for(int i=1;i<=findMin(arr);i++){
            k=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%i!=0){
                    k=false;
                    break;
                }
            }
            if(k){
                 ans=Math.max(i,ans);

            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Now enter the nos. to finds its hcf");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("The hcf of given no. is: "+ find(arr));

    }
}
