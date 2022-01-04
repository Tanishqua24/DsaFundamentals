class Solution
{
    public int binarysearch(int[] nums, int target)
    {
        int low =0;
        int high=nums.length -1;
        int mid=0;
        
        while(low <= high)
        {
          
            if(target==nums[mid])
            {
                return mid;
            }
  mid = high+(low-high)/2;
            
            if(target > nums[mid])
            {
                low = mid + 1;
            }
            else if(target < nums[mid])
            {
                high = mid - 1; 
            } 
            
        }
        return -1;
    }
} 