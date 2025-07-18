class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> result = new ArrayList<>();
      int max =0 ;
      for (int n : candies)
      {
        max = Math.max(max , n);
      }  
      for (int n : candies)
      {
        result.add(n + extraCandies >= max);
      }
      return result;
    }
}