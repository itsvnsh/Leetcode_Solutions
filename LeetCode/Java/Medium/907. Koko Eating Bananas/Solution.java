class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        int mid=0;
        for (int pile : piles) {
            if (pile > right) {
                right = pile; 
            }
        }
        while(left<right){
            int hours=0;
            mid=left+(right-left)/2;
            for(int i=0;i<piles.length;i++){
               hours+=(piles[i]+mid-1)/mid; 
            }
            if(hours<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
            
        
        }
        return left;

    }
}