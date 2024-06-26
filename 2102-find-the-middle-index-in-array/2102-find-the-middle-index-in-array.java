class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int l=0;
        int s=0;
        for (int i=0 ;i<nums.length; i++)
        {
            s=s+nums[i];
        }
        for (int i=0; i<nums.length; i++)
        {
            s=s-nums[i];
            if (l==s)
            {
                return i;
            }
            l = l+nums[i];
        }
        return -1;
    }
}