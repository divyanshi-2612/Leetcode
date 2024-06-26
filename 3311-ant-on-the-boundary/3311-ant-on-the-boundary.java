class Solution {
    public int returnToBoundaryCount(int[] nums) 
    {
        int c=0;
        int t=0;
        for (int i:nums)
        {
            t+=i;
        
        if (t==0)
        {
            c++;
        }
        }
        return c;
    }
}