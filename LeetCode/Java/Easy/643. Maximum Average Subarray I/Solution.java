class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int nos=n-k;
        int j=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxi=sum/k;
        while(nos!=0){
            sum=sum-nums[j]+nums[j+k];
            double avg=sum/k;
            maxi=Math.max(avg,maxi);
            j++;
            nos--;
        }
       
        return maxi;
    }

}