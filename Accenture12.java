import java.util.Scanner;

public class Accenture12 {
    public static int [] LeaderSum(int arr[]){
        int []ans=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    max=Math.max(max,arr[j]);
                }
            }
            if(max>0){
                ans[i]=max;
            }
            else{
                ans[i]=-1;
            }
        }
        return ans;
    }
     
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=LeaderSum(arr);
        // System.out.println(ans);
            arr=LeaderSum(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            // System.out.println(arr);

    }
}
