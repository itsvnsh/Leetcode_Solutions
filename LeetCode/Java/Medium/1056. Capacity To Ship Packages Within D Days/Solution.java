class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        
        int mid=0;
        for(int weight:weights){
            if(left<weight){
                left=weight;
            }
        }
        for(int weight:weights){
            right+=weight;
        }
        while(left<right){
            int day=1;
            int sum=0;
            mid=left+(right-left)/2;
            for(int i=0;i<weights.length;i++){
                if((weights[i]+sum)>mid){
                    day++;
                    sum=0;
                    sum+=weights[i];
                }
                else{
                    sum+=weights[i];
                }
            }
            if(day<=days){
                right=mid;
            }
            else if(day>days){
                left=mid+1;
            }
            
        }
        return left;
    }
    
}