public class RatCountHouse {
    public static int sol(int r,int unit,int arr[],int n){
        if(n==0){
            return 0;
        }
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>=(r*unit)){
                break;
                
            }
                        count++;
        }
        if(sum<r*unit){
                        return 0;

        }
            else{
                return count+1;
            }
        
    }
    public static void main(String[]args){
        int []arr={2,8,3,5,7,4,1,2};
        int ans=sol(7,2,arr,8);
        System.out.println(ans);

    }
}
