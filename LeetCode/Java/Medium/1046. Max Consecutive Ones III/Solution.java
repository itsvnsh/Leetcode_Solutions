class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0;
        int e=0;
        int z=0;

        while(e<nums.length){
            if(nums[e] == 0) z++;
            e++;
            if(z>k){
                if(nums[s] == 0) z--;
                s++;
            }
        }
        return e-s;
    }
}