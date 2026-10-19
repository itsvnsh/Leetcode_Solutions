class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int length=0;
        int maxl=Integer.MAX_VALUE;
        int left=0;
       for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                length=right-left+1;
                sum-=nums[left];
                left++;
                maxl=Math.min(maxl,length);
            }
            
        }
        if(maxl==Integer.MAX_VALUE){
            return 0;
        }
        return maxl;
    }
}