import java.util.ArrayList;
import java.util.Scanner;

public class Accenture11 {
    public static ArrayList<Integer>nextSmallerNumber(int arr[]){
        if(arr.length==0){
            return null;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    ans.add(arr[j]);
                    break;
                }
                else if(j==arr.length-1){
                    ans.add(-1);
                    break;
                }
            }
        }
        return ans;
    }
    public static ArrayList<Integer>nextSmallerNumber1(int arr[]){
        if(arr.length==0){
            return null;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
                       int var=0;

            for(int j=i;j<arr.length;j++){
                
                if(arr[i]>arr[j]){
                     var=Math.max(arr[j],var);
                }
               
               else if(j==arr.length-1 ){
                    ans.add(-1);
                    break;
                }
            }
            if(var!=0)
             ans.add(var);

            
        }
        return ans;
    }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int arr1[]={3,2,11,7,6,8,6,1};
        ArrayList<Integer>ans=new ArrayList<>();
        ans=nextSmallerNumber1(arr);
        System.out.println(ans);
        
    }
}
