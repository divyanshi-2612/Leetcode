class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
         if (nums == null || nums.length < 3) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(nums);
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < nums.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) 
      
      {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) 
        {

          // Add the set, and move to find other triplets
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
        } 
        else if (sum < 0)
          left++;
        else
          right--;
      }
    }
    return new ArrayList<>(result);
  }

        
    }
