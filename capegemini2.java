import java.util.Scanner;

public class capegemini2 {
    public static void countInt(int num[]){
        
        int count;
        int k=0;
        int arr[]=new int[num.length];
        for(int i=0;i<num.length;i++){
                count=0;
            for(int j=0;j<=i;j++){
                if(num[i]==num[j]){
                    count++;
                }
               
                
            }
             if(count==1){
                    arr[k]=num[i];
                    k++;
                    // System.out.println(arr[k]);
                }
            
            // System.out.println(num[i]+" occurs " + count+" times");
        }
        System.out.println(k);
        for(int i=0;i<k;i++){
            int count1=0;
           for(int j=0;j<num.length;j++){
            if(arr[i]==num[j]){
                count1++;
            }
           }
           System.out.println(arr[i]+" occurs "+ count1+" times");
        }
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int arr[]={1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
        countInt(arr);
    }
}
