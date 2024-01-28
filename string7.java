import java.util.Scanner;
class string7{
    public static String alternate(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                res+=Character.toUpperCase(str.charAt(i));
            }
            else{
                res+=str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to convert its character alternate to upper case");
        String str=sc.nextLine();
        
        
        String st=alternate(str);
        System.out.println(st);
    }
}