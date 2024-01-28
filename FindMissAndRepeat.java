import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FindMissAndRepeat{
    
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int Findmiss(List <Integer>arr){
        Set<Integer>set=new HashSet<>();
        int count=1;
        for(int i=0;i<arr.size();i++){
            set.add(arr.get(i));
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=arr.size();i++){
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
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int count=1;
        
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        //  map.put(A.get(0),count);

        for(int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i))){
                count++;
            }
            map.put(A.get(i),count);
        }
        for(int i:map.keySet()){
           
            if(map.get(i)==2){
                ar.add(i);
                ar.add(Findmiss(A));
                break;
                
            }
        }
        return ar;
        
    }
    public static void main(String[]args){
        List<Integer>li=new ArrayList<>();
        int arr[]={1,2,3,2,4,6};
        for(int i=0;i<arr.length;i++){
            li.add(arr[i]);
        }
        ArrayList<Integer>ans=repeatedNumber(li);
        System.out.println(ans);
    }
}

