import java.util.Scanner;

public class Accenture16 {
    public static int findBulbs(int n){
        int arr[]=new int[n];
        for(int i=2;i<=n;i++){
            for(int j=0;j<n;j++){
                int k=j+1;
                if(k%i ==0){
                    if(arr[j]==0){
                        arr[j]=1;
                    }
                    else if(arr[j]==1){
                        arr[j]=0;
                    }
                }
                
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        System.out.println("Enter the no. of rounds");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=findBulbs(n);
        System.out.println("The no. of on bulbs after "+n+" rounds are: "+ans);
        
    }
}
