class Solution {
    public int tribonacci(int n) 
    {
        int x=0;
        int y=1;
         int z=1;
         int s=0;
         if (n==0)
         return 0;
         if (n==2 || n==1)
         return 1;
         for (int i=3; i<=n; i++)
         {
            s = x+y+z;
            x=y;
            y=z;
            z=s;
         }
         return s;
    }
}