class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int retval = 0;
        
        int i = 0;
        while(i < arr.length - retval) {
            int j = i;
            List<Character> currSub = new ArrayList<Character>();
            Set<Character> set = new HashSet<>();
            while (j < arr.length) {
                if (!set.contains(arr[j])) {
                    currSub.add(arr[j]);
                    set.add(arr[j]);
                    j++;
                } else {
                    break;
                }
            }
            retval = Integer.max(retval, currSub.size());
            i++;
        }
        
        return retval;
    }
}
