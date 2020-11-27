class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max_value) {
                max_value = candies[i];
            }
        }
        
        List<Boolean> retval = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            retval.add(candies[i] + extraCandies >= max_value);
        }
        
        return retval;
    }
}
