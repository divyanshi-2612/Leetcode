class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> l = new ArrayList<>();

        List<Integer> li = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i: nums1)
        {
            s1.add(i);
        }
        for (int i:nums2)
        {
            s2.add(i);
        }
        for (int i: s1)
        {
            if (s2.contains(i)==false)
            li.add(i);
        }
        for (int i: s2)
        {
            if (s1.contains(i)==false)
            l2.add(i);
        }
        l.add(li);
        l.add(l2);
        return l;
    }
}