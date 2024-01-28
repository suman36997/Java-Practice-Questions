import java.util.Scanner;

public class Accenture20 {
    public static int[] product(int arr[]){
        int pro=1;
        for(int i=0;i<arr.length;i++){
            pro=pro*arr[i];
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=pro/arr[i];
        }
        return ans;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Now enter the elements of array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=product(arr);
        for(int i=0;i<ans.length;i++)
        System.out.print(ans[i]+" ");

    }
}
