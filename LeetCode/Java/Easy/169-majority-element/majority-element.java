class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int result=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.getOrDefault(num,0)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}