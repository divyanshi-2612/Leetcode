class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int c=0;
        int m=0;
        
        int n=gain.length;
        
        for (int i=0; i<n; i++)
        {
          c+=gain[i];
           m=Math.max(c,m);
        }

        
        return m;
        
        

    }
}