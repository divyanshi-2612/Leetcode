class Solution 
{
    public boolean isHappy(int n)
    {

      while (n!=1 && n!=4)
      {
        int s=0;
        while (n!=0)
        {
            int m = n%10;

            s+=(m*m);
            n/=10;
        }
        n=s;
      }
      return n==1;
    }
}