import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findMaxOccChar {
    // public static void findMaxChar(String str){
    //     HashMap<Character,Integer>map=new HashMap<>();
    //     int count=1;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<str.length();i++){
            
    //         if(map.containsKey(str.charAt(i))){
    //             count++;
    //         }
    //         else{
    //             count=1;
    //         }
            
    //         map.put(str.charAt(i),count);
    //     }
    //     for(Map.Entry<Character,Integer>entry:map.entrySet()){
    //         max=Math.max(max,entry.getValue());
    //         System.out.println(entry.getKey()+" "+entry.getValue());
    //     }
    //     for(Map.Entry<Character,Integer>entry:map.entrySet()){
    //         if(entry.getValue()==max){
    //             System.out.println(entry.getKey());
    //             break;
    //         }
    //     }}
        public static char findMaxChar(String str){
            int[]arr=new int[256];
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)]=arr[str.charAt(i)]+1;
            }
            int max=-1;
            char c='a';
            for(int i=0;i<str.length();i++){
                if(max<arr[str.charAt(i)]){
                    max=arr[str.charAt(i)];
                    c=str.charAt(i);
                }
            }
            return c;
    }
    public static ArrayList<Integer> ans(String str){
            ArrayList<Integer>ar=new ArrayList<>();
            int count=0;

            HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){

                count=map.get(str.charAt(i))+1;
                
            }
            else{
                count=0;
            }
            ar.add(count);

            
            map.put(str.charAt(i),count);
        }
        return ar;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to print the max repeating element");
        String str=sc.nextLine();
        // char max=findMaxChar(str);
        // System.out.println(max);
        ArrayList<Integer>ar=ans(str);
        System.out.println(ar);

    }
}
