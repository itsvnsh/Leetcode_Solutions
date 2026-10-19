class Solution {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    int k=0;
    public int findKthLargest(int[] nums, int k) {
        this.k=k;
        for(int num:nums){
            minheap.add(num);
            if(minheap.size()>this.k){
                minheap.poll();
            }
        }
        
        return minheap.peek();
        
    }
}