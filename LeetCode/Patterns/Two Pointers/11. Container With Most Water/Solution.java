class Solution {
    public int maxArea(int[] nums) {
        int len=nums.length-1;
        int left=0;
        int right=len;
        int max_vol=0;;
        while(left<right){
            int vol=vol(nums,left,right);
            max_vol=Math.max(max_vol,vol);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_vol;

        
    }
    public int vol(int[] nums,int left,int right){
        int height=Math.min(nums[left],nums[right]);
        int width=right-left;

        return height*width;
    }
    
    
}