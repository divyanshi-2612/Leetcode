class Solution {
    public String reverseWords(String s) 
    {
        String [] s1 = s.trim().split("\\s+");
        String s2 = "";
        for (int i= s1.length-1; i>0; i--)
        {
            s2+= s1[i]+" ";
        }
        return s2+s1[0];
        
    }
}