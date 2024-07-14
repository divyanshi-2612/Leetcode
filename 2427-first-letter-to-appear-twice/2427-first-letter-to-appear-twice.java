class Solution {
    public char repeatedCharacter(String s) 
    {
        int a[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i)-'a'] += 1;
            if(a[s.charAt(i)-'a'] == 2)
                return s.charAt(i);
        }
        return 'a';
    }
}