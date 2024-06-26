class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int x[] = new int[n];
        x[0]=1;
        for (int i=1; i<n; i++)
        {
            x[i] = x[i-1] * nums[i-1];
        }
        int s=1;
        for (int i=n-1; i>=0; i--)
        {
            x[i] *= s;
            s*= nums[i];
        }
        return x;
    }
}