class Solution {
    public int search(int[] nums, int target)
     {
        int l=0 , r=nums.length-1, m;
        while (l<=r)
        {
            m=l+(r-l)/2;
            if (nums[m]==target) return m;

            else if (nums[l]<=nums[m]) // this line checks left part of middle element is sorted or not
            {
              if (nums[m] < target ) l=m+1;
              else if (target < nums[l]) l=m+1;
              else r=m-1;
            }

            else 
            {
                if (target<nums[m]) r=m-1;
                else if (nums[r] < target) r=m-1;
                else l=m+1;
            }
        }
        return -1;
        
    }
}