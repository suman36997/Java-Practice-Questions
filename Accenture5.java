public class Accenture5 {
    static int differenceofSum(int n,int m){
        int sum1=0;int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n!=0){
                sum2=sum2+i;
            }
            else{
                    sum1=sum1+i;

            }
        }
        return Math.abs(sum1-sum2);
    }
    public static void main(String []args){
        int ans=differenceofSum(4,20);
        System.out.println(ans);
    }
}
