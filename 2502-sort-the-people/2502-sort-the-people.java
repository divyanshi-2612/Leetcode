class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        int n=names.length;
        int m=heights.length;
        for (int i=0; i<m; i++)
        {
            for (int j=i+1; j<m; j++)
            {
                if(heights[j]>heights[i])
                {
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;

                    int t = heights[i];
                    heights[i]=heights[j];
                    heights[j]=t;
                }
            }
        }
        return names;
    }
}