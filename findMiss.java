import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class findMiss {
    public static int Findmiss(int []arr){
        Set<Integer>set=new HashSet<>();
        int count=1;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            al.add(i);

        }
        for(int i=0;i<al.size();i++){
            if(!set.contains(al.get(i))){
                break;
            }
            count++;
        }
        
        return count;
    }
    public static void main(String[]args){
        int arr[]={1,2,2,3,4,6};
        int ans=Findmiss(arr);
        System.out.println(ans);
    }
}
