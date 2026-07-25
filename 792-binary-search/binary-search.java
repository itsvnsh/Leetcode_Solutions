class Solution {
    public int search(int[] nums, int target) {
        int len=(nums.length )-1 ;
        int low=0;
        int high=len;
        int index=binary_search(nums,low,high,target);
        return index;
    }
    public int binary_search(int[] nums,int low, int high,int target){
        int mid=low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(target==nums[mid]){
            return mid;
        }
        else if(target>nums[mid]){
            return binary_search(nums,mid+1,high,target);
        }
        else{
            return binary_search(nums,low,mid-1,target);
        }
    }
}