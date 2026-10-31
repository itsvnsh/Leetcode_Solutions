class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;int right=matrix.length-1; int last=matrix[0].length - 1;int first=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<matrix[mid][0]){
                right=mid-1;
            }
            else if(target>matrix[mid][last]){
                left=mid+1;
            }
            else{
                int mid1=first+(last-first)/2;
                if(target==matrix[mid][mid1])return true;
                else if(target>matrix[mid][mid1]){
                    first=mid1+1;
                }
                else {
                    last=mid1-1;
                }

            }
            
        }
        return false;
    }
}