class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);


        int count = 1; // To track the count of the current element
        for (int i = 1; i < n; i++) 
        {
            if (nums[i] == nums[i - 1]) 
            {
                count++;
            } 
            else 
            {
                if (count > n / 3) 
                {
                    result.add(nums[i - 1]);
                }
                count = 1; // Reset count for the next element
            }
        }

        // Step 3: Check the last element
        if (count > n / 3) {
            result.add(nums[n - 1]);
        }

        return result;
    }
}

