class Solution {
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    int k=0;
    public int findKthLargest(int[] nums, int k) {
        this.k = k;
        for(int i=0;i<nums.length;i++){
            maxheap.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            maxheap.poll();
        }
        return maxheap.poll();
        
    }
}