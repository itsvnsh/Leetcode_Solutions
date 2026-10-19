class Solution {
    public int firstStableIndex(int[] nums, int k) {
        ArrayList <Integer> List1 = new ArrayList<>();
        ArrayList <Integer> List2 = new ArrayList<>();
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            List1.add(nums[i]);
        }
        for(int i=0;i<len;i++){
            List2.add(nums[i]);
            int stable = Collections.max(List2)-Collections.min(List1);
            List1.remove(Integer.valueOf(nums[i]));
            if(stable<=k){
                return i;
            }
        }
        return -1;  
    }
}