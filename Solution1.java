import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int count=1;
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
       

        for(int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i))){
                count++;
            }
            map.put(A.get(i),count);
        }
        for(int i:map.keySet()){
            System.out.println("no. is "+i+" and key "+map.get(i));
            if(map.get(i)==2){
                ar.add(i);
                ar.add(i+1);
                break;
                
            }
        }
        return ar;
        
    }
    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);

        int arr[]={3, 1, 2, 5, 3};
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            li.add(arr[i]);
        }
        ArrayList<Integer>ar=new ArrayList<>();
        ar=repeatedNumber(li);
        for(int i=0;i<ar.size();i++){
            System.out.print(ar.get(i));

        }


    }
}
