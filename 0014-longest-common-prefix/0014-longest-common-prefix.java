class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int n = strs.length;
         Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[n-1];
             int c=0;
             while (c<s1.length())
             {
                if (s1.charAt(c) == s2.charAt(c))
                {
                    c++;
                }
                else
                {
                    break;
                }
             }
             return c==0?"":s1.substring(0,c);

    }
}