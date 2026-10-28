class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int target=Integer.MAX_VALUE;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
                target=Math.min(target,nums[mid]);
            }else{
                right=mid;
                target=Math.min(target,nums[mid]);
            }
            target=Math.min(target,nums[mid]);
        }
        return target;
    }
}