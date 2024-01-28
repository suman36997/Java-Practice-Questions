import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Accenture21 {
    public static int PollSystem(int candi[],int age[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=1;
       for(int i=0;i<age.length;i++){
        if(map.containsKey(candi[i])){
            count=map.get(candi[i])+1;
        }
        else{
            count=1;
        }
         if(age[i]>=18){
            map.put(candi[i],count);
        }
       }
       int maxi=0;
       for(Map.Entry<Integer,Integer>m:map.entrySet()){
                // System.out.println(m.getKey()+" "+m.getValue());

        maxi=Math.max(m.getValue(),maxi);
       }
       return map.get(maxi);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  both candidate and age array");
        int size=sc.nextInt();
        int candi[]=new int[size];
        int age[]=new int[size];
        System.out.println("Now enter the elements of candidate array");
        for(int i=0;i<candi.length;i++){
            candi[i]=sc.nextInt();
        }  
        System.out.println("Now enter the elements of age array");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }  
        int ans=PollSystem(candi,age);
        System.out.println("Now the winner is : "+ans);
    }
    
}
