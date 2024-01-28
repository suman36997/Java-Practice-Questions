import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Accenture8 {
    public static int AddDistinctSubDuplicate(int a,int b,int c ,int d){
        int sumDis=0;
        int ar[]={a,b,c,d};
        int sumDup=0;
        int count=1;
        HashMap<Integer,Integer>map=new HashMap<>();
                // map.put(ar[0],count);

        for(int i=0;i<ar.length;i++){
            // count=1;
            if(map.containsKey(ar[i])){
                count=map.get(ar[i])+1;
            }
            else{
                count=1;
            }
            map.put(ar[i],count);

            if(count==2){
            sumDup=ar[i]+sumDup;
        }
            else if(count>2){
                continue;
            }
        }
        
        
        for(int i:map.keySet()){
            if(map.get(i)==1){
                sumDis=sumDis+i;
            }
            
        }
        // System.out.println(sumDis);
        return sumDis-sumDup;
        }
        
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c,d");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int ans=AddDistinctSubDuplicate(a, b, c, d);
        System.out.println("Ans: "+ans);
    }
}
