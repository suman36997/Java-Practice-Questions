import java.util.Scanner;

public class FindLcm {
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }
    for(int i=2;i<num;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
  }
    public static int find(int a ,int b){
        int ans=1;
        int temp1=a;
        int temp2=b;
        int maxi=Math.max(a,b);
        int min=Math.min(a,b);
        int k=2;
        if(maxi%min==0){
            return maxi;
        }
        for(int i=1;i<Math.min(a,b);i++){
            if(temp1%k==0 && temp2%k==0){
                ans=ans*k;
                temp1=temp1/k;
                temp2=temp2/k;
            }
            else{
                k++;
            }
            if(isPrime(temp1) || isPrime(temp2)){
                break;
            
            }
        }

        return ans*temp1*temp2;
    }
    public static int findArrayLcm(int arr[]){
        int ans=find(arr[0], arr[1]);
        for(int i=2;i<arr.length;i++){
            ans=find(ans,arr[i]);
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array .");
        int size=sc.nextInt();
        System.out.println("Now enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int ans=findArrayLcm(arr);
        System.out.println("LCM of these nos. is : "+ans);
        
    }
}
