class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int n = nums.length;
        for (int i=0; i<n; i++)
        {
            for (int j=1; j<=k; j++)
            {
                if (i+j>=n)
                break;
                   if (nums[i]==nums[i+j]) 
                   return true;
            }
        }
        return false;
    }
}