import java.util.*;
public class Accenture1 {
    public static int findSumOf2largeand2small(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer>evenSum=new ArrayList<>();
        ArrayList<Integer>oddSum=new ArrayList<>();
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenSum.add(arr[i]);
            }
            else{
                oddSum.add(arr[i]);
            }
        }
        // Collections.sort(evenSum);     
        //    Collections.sort(oddSum);

       return res=evenSum.get(evenSum.size()-2)+oddSum.get(1);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,8,0,2,3,5,6};
        int res=findSumOf2largeand2small(arr);
        System.out.println(res);
    }
}
