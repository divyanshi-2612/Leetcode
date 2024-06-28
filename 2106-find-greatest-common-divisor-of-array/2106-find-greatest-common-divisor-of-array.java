class Solution {
    public int findGCD(int[] nums) 
    {
          int n=1;
        int min = nums[0];
        int max = nums[0];
        for (int i=0; i<nums.length; i++)
        {
            if (max < nums[i])
            {
                max = nums[i];
            }
            if (min > nums[i])
            {
                min = nums[i];
            }
        }
        for (int i=1; i<=max;  i++)
        {
            if ((max%i==0) && (min%i==0))
            n=i;
            
        }
        return n;
       
    }
}