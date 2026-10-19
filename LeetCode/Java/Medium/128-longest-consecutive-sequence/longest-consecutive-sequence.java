class Solution {

// If num - 1 does not exist, num is the start of a sequence
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        int seq=0;
        int current;
        for(int num:set){
            if(!set.contains(num-1)){
                current = num;
                seq=1;
                while(set.contains(current+1)){
                    current++;
                    seq++;
                }
                max=Math.max(max,seq);
            }
            
        }
        return max;
    }
}