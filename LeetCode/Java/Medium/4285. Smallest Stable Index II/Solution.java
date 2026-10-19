class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len=nums.length;
        int[] minarray= new int[len];
        minarray[len - 1] = nums[len - 1];
        for(int j=len-2;j>=0;j--){
            minarray[j]=Math.min(nums[j],minarray[j+1]);
        }
        int max=nums[0];
        for(int i=0;i<len;i++){
            max=Math.max(max,nums[i]);
            int min=minarray[i];
            int stable=max-min;
            if(stable<=k){
                return i;
            }
        }
        return -1;
    }
}