class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length()) 
        {
            return false;
        }
        char arr1[]= s.toCharArray();
         char arr2[]= t.toCharArray();
       ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> al1 = new ArrayList<>();

        // Add characters of s to al
        for (char a : arr1) {
            al.add(a);
        }

        // Add characters of t to al1
        for (char a1 : arr2) {
            al1.add(a1);
        }

        // Check if both lists contain the same elements in the same frequency
        for (char a : arr1) {
            if (al1.contains(a)) {
                al1.remove((Character) a); // Remove one occurrence of the character
            } else {
                return false; // If a character in s is not in t, return false
            }
        }

        return al1.isEmpty(); // If al1 is empty, they are anagrams
    }
}



         
   
