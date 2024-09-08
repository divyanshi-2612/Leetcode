class Solution {
    public int countDigits(int num) 
    {
        int x = num;
        int c=0;
        int a=0;
        while(num>0)
        {
            a=num%10;
            if (x%a==0)
            {
                c++;
            }
            num = num/10;
        }
        return c;
    }
}