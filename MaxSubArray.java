public class MaxSubArray {
    static int findMax(int arr[]){
        int sum=-9999;
        int ans=0;
        for(int i=0;i<arr.length;i++){
                            sum=0;

            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
    public static void main(String[]args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int ans=findMax(arr);
        System.out.println(ans);
    }
}
