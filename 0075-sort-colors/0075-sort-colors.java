class Solution {
    public void sortColors(int[] nums) 
    {
        int a[]= new int[3];
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i]==0)
            a[0]++;
            else if (nums[i]==1)
            a[1]++;
            else
            a[2]++;
        }
        int i=0;
        while (a[0]!=0)
        {
            nums[i++]=0;
            a[0]--;
        }
        while (a[1]!=0)
        {
            nums[i++]=1;
            a[1]--;
        }
        while (a[2]!=0)
        {
            nums[i++]=2;
            a[2]--;
        }
    }
}