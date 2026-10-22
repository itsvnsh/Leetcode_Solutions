int searchInsert(int* nums, int numsSize, int target) {
    int found=0;
    int s=0;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            found=1;
            s=i;
            break;
        }
    }
    if(found==0)
    {
        for(int i=0;i<numsSize;i++)
        {
            if(nums[i]>target)
            {
                s=i;
                break;
            }
            else
            {
                s=i+1;

            }
        }
    }
    return s;
    
}