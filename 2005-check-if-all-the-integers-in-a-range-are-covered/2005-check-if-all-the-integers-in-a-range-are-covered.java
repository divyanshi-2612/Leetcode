class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) 
    {
        int n = ranges.length;
        
        for (int i=left; i<=right; i++)
        {
            boolean t = false;
            for (int j=0; j<n; j++)
            {
                if (i>=ranges[j][0] && i<=ranges[j][1])
                {
                    t = true;
                    break;
                }
            }
            if (t==false)
            return false;
        }
        return true;

    }
}