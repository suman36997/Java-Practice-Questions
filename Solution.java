import java.util.Scanner;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
            
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
        for( i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");

        }
            
        
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int m=3;
        int nums1[]={1,2,3,0,0,0};
        int n=3;
        int nums[]={2,5,6};
        merge(nums1,m,nums,n);
    }
}
