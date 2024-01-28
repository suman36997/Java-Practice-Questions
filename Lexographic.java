import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Lexographic{
    public static void solve(int nums[],int index,List<List<Integer>>ans){
       
        if(index>=nums.length){
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            solve(nums,index+1,ans);
            swap(nums,i,index);
        }
    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
     public static List<List<Integer>> recpermutation(int []nums){
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        solve(nums,0,ans);
        return ans;
     }

    //  public static int findrank(int []nums){
    //     Arrays.sort(nums);
        
    //     List<List<Integer>>ans=new ArrayList<List<Integer>>();
    //     ans=recpermutation(nums);
    //     int count=1;
    //     int i=0;
    //     while(nums!=ans.get(i)){
    //         count++;
    //         i++;
    //     }
    //  }
     public static void main(String args[]){
        int nums[]={1,2,3,4};
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        ans=recpermutation(nums);
        System.out.println(ans);
     }
}