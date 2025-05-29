class Solution {
    public int search(int[] nums, int target) 
    {
        int s=0;
        int n = nums.length-1;
        while (s<=n)
        {
            int mid = s+ (n-s)/2;
            if (nums[mid] == target) return mid;
            else if (target < nums[mid]) n = mid -1;
            else s = mid+1;
        }
        return -1;
        
    }
}