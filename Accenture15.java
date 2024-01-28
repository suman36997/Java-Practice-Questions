public class Accenture15 {
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
            else{
                System.out.println();
                System.out.print(Character.toLowerCase(str.charAt(i)));
                
            }
        }
    }
    public static void main(String[]args){
        String str = "sumanIsAGoodBoy";
        print(str);
    }
}
