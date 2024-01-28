import java.util.Scanner;
class Accenture{
    public static int defSum(int n,int m){
        int res1=0;
        int res2=0;
        for(int i=0;i<=m;i++){
            if(i%n!=0){
                res1=res1+i;
            }
            else{
                res2=res2+i;
            }
        }
       
        return res1-res2;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and m");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int res=defSum(n, m);
        System.out.println(res);

    }
}