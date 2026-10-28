class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int target=Integer.MAX_VALUE;
        while(left<right){
             int mid=left+(right-left)/2;
            if (nums[left] < nums[right]) {
            target = Math.min(target, nums[left]);
            break;
            }
           
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}