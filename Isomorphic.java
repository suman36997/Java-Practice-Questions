import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {
    public static boolean check(String s1,String s2){
        HashMap<Character,Character>map1=new HashMap<>();
        // HashMap<Character,Boolean>map2=new HashMap<>();
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(map1.containsValue(ch2)){
                    return false;
                }
                
                    map1.put(ch1,ch2);
                    // map2.put(ch2,true);
                
            }
        }
        return true;
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two String to check is it isomorphic or not");
        String str1=sc.nextLine();        
        String str2=sc.nextLine();
        if(check(str1,str2)){
            System.out.println("Isomorphic String");
        }
        else{
            System.out.println("Not a Isomorphic String");
        }


        
    }
}
