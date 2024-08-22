class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet <Integer> h1 = new HashSet<>();
        for (int v:nums1)
        {
            h1.add(v);
        }
        HashSet <Integer> h2 = new HashSet<>();
        for (int v2:nums2)
        {
            if (h1.contains(v2))
            {
                h2.add(v2);
            }
        }
        int a[] = new int [h2.size()];
        int i=0;
        for (int v3:h2)
        {
            a[i++]=v3;
        }
        return a;
    }
}