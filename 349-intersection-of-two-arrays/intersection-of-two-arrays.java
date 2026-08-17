class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> list = new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                list.add(num);
            }
        }
        int[] array = list.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
        return array;



        
    }
}