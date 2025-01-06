class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        List<Integer> al = new ArrayList();
          List<Integer> al2 = new ArrayList();
         
        for (int i:nums)
        {
            if (i>0)
            al.add(i);
            else
            al2.add(i);
        }
        for (int i=0; i<nums.length; i++)
        {
            if (i%2==0)
            nums[i]= al.get(i/2);
            else
            nums[i]=al2.get(i/2);
        }
        return nums;

        
    }
}