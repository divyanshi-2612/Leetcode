class Solution {
    public String shortestPalindrome(String s) 
    {
        
        String reversed = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith(reversed.substring(i))) {
                return reversed.substring(0, i) + s;
            }
        }
        return "";
    }
}

        
    
