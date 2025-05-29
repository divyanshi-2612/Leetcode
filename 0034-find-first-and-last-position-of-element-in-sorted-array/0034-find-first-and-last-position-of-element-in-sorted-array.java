class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        
        // Step 1: Find the first occurrence of target
        int first = findPosition(nums, target, true);

        // Step 2: Find the last occurrence of target
        int last = findPosition(nums, target, false);

        // Step 3: Return both positions in an array
        return new int[]{first, last};
    }

    // This function finds either the first or last index of the target
    private int findPosition(int[] nums, int target, boolean findFirst) {
        int result = -1;               // default if not found
        int start = 0, end = nums.length - 1;

        // Binary search begins
        while(start <= end) {
            int mid = start + (end - start) / 2;  // calculate mid safely

            if(nums[mid] == target) {
                result = mid; // store index where target is found

                if(findFirst) {
                    // if finding first, move left
                    end = mid - 1;
                } else {
                    // if finding last, move right
                    start = mid + 1;
                }
            } else if(nums[mid] < target) {
                start = mid + 1; // move right if mid value is too small
            } else {
                end = mid - 1;   // move left if mid value is too big
            }
        }

        return result; // returns index or -1 if not found
   


    }
}