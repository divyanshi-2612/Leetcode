class Solution {
    public int longestConsecutive(int[] nums) 
    {
        
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // removes duplicates
        }

        int longest = 0;

        for (int num : set) {
            // Only start counting if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    


        
    }
}