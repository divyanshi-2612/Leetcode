class Solution {
    public int pivotInteger(int n) 
    {
        int r=0;
        for (int i=n; i>0; i--)
        {
            r+=i;
            int l = (i*(i+1))/2;
            if (l==r)
            {
                return i;
            }
        }
        return -1;
    }
}