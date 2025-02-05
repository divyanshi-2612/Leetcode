class Solution {
    public int maxProduct(int[] nums) 
    {
        int maxp=Integer.MIN_VALUE;
        int n = nums.length;
        for (int i=0; i<n; i++)
        {
            int p =1;
            for (int j=i; j<n; j++)
            {
                p*=nums[j];
                maxp = Math.max(p,maxp);
            }
            
        }
        return maxp;
        
    }
}