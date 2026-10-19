class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        HashMap <Integer,Integer> map1 = new HashMap<>();
        for( int num1:nums1){
            map1.put(num1,map1.getOrDefault(num1, 0) + 1); 
        }
        HashMap <Integer,Integer> map2 = new HashMap<>();
        for( int num2:nums2){
            map2.put(num2,map2.getOrDefault(num2,0)+1);
        }

        ArrayList<Integer> array = new ArrayList<>();
        int freq=0;
        for(int num:map1.keySet()){
            freq= Math.min(map1.get(num),map2.getOrDefault(num,0));
            for(int i=0;i<freq;i++){
            array.add(num);
        }
        }

       return array.stream().mapToInt(Integer::intValue).toArray();
       


        






    }
}