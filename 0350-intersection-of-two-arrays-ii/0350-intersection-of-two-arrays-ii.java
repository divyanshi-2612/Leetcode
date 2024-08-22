class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        ArrayList <Integer> h1 = new ArrayList<>();
        for (int v:nums1)
        {
            h1.add(v);
        }
        ArrayList <Integer> h2 = new ArrayList<>();
        for (int v2:nums2)
        {
            if (h1.contains(v2))
            {
                h2.add(v2);
                 h1.remove(Integer.valueOf(v2));
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