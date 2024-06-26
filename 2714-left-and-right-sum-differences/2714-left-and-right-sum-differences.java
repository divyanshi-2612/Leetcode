class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int n = nums.length;
        int x[] = new int[n];
        int y[] = new int[n];
        int z[] = new int[n];
        int r=0;
        int l=0;
        for (int i=0; i<n; i++)
        {
            if (i==0)
            {
                x[i] = 0;
            }
            else
            {
                r = r+ nums[i-1];
                x[i] = r ;
            }
               
        }
        for (int i=n-1; i>=0; i--)
        {
            if (i==n-1)
            {
                y[i]=0;
            }
            else 
            {
                 l = l+nums[i+1];
                y[i] = l ;
            }
            
        }
        for (int i=0 ;i<n; i++)
        {
            z[i] = Math.abs(x[i] - y[i]);
        }
        return z;
    }
}