class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] array= new int[k];
        for(int i=0;i<k;i++){
           int freq=0;
           int element=0;
           for(int key:map.keySet()){
            if(map.get(key)>freq){
                freq=map.get(key);
                element=key;
            }
           }

            array[i]=element;
            map.remove(element);
        }
          
           
        
        return array;
        
    }
}