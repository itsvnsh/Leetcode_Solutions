class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] nums2=new int[n];
        int left=0;
        int right=n-1;

        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                nums2[i]=nums[left]*nums[left];
                left++;
            }
            else{
                nums2[i]=nums[right]*nums[right];
                right--;
            }
        }
        return nums2;
    }
    
}