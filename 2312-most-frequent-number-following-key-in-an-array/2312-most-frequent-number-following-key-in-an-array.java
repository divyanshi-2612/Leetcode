class Solution {
    public int mostFrequent(int[] nums, int key) 
    {
        

        int[] arr = new int[1001];
        int max = 0;
        int ans = 0;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == key)
            {
                arr[nums[i+1]]++;
                if (max < arr[nums[i+1]])
                {
                    max = arr[nums[i+1]];
                    ans = nums[i+1];
                }
            }
        }
        return ans;

    }
}