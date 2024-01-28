public class Accenture14 {
    public static int DesiredArray(int arr[],int n , int k){
        int sum=0;
        Boolean x=true;
        int y=1;
        int count =0;
        while(count!=k){
            x=true;
            for(int i=0;i<n;i++){
                if(y%arr[i]==0){
                    x=false;
                    break;
                }
            }

            if(x){
                count++;
                // System.out.print(y+" ");
                sum=sum+y;
            }
             y++;

        }
        return sum;
    }
    public static void main(String []args){
        int arr[]={2,3,4,5,6};
        int ans=DesiredArray(arr, 5, 4);
        System.out.println(ans);
    }
}
