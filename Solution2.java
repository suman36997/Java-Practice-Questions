import java.util.PriorityQueue;

class Solution2 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        k=nums.length-k;
        for(int i=0;i<k;i++){
            pq.poll();
        }
        return pq.peek();
    }
    public static void main(String []args){
        int arr[]={3,2,1,5,6,4};
        int k=2;
        int ans=findKthLargest(arr,k);
        // findKthLargest(arr,k);
        System.out.println(ans);

        

    }
}