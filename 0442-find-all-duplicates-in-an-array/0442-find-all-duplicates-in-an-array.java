class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> li = new ArrayList<> ();
        HashSet<Integer> h = new HashSet<>();
        for (int i=0; i<nums.length; i++)
        {
            if (h.contains(nums[i])) 
            {
                li.add(nums[i]);
            }
            h.add(nums[i]);
        }
        return li;
    }
}