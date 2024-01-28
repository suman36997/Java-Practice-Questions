import java.util.Scanner;

public class PlusOne {
    public static int[] plusone(int []digits){
        
        int arr[]=new int[digits.length+1];
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        arr[0]=1;
        return arr;
        

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Now enter the elemets in array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=plusone(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
    }
}
