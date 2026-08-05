class Solution {
    PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());
    int diff=0;
    public int lastStoneWeight(int[] stones) {
        for(int i=0;i<stones.length;i++){
            heap.offer(stones[i]);
        }
        while(heap.size()>=2){
            int x=heap.poll();
            int y=heap.poll();
            diff=Math.abs(x-y);
            heap.offer(diff);
        }
        return heap.peek();
        


        
    }
}