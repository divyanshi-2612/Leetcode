class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int x=0;
        for (int y:nums)
        {
            x = x^y;
        }
        return x;
    }
}