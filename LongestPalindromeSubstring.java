class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        String retval = s.substring(0, 1);
                
        //Start at each letter and move outwards
        int center = 0;
        while (center < arr.length - retval.length() / 2) {
            String odd = expandOutward(center, center, arr);
            if (odd.length() > retval.length()) {
                retval = odd;   
            }
            String even = expandOutward(center, center + 1, arr);
            if (even.length() > retval.length()) {
                retval = even;   
            }
            
            center++;
        }
        return retval;
    }
    
    private String expandOutward(int l, int r, char[] arr) {
        List<Character> currSub = new LinkedList<>();
        int dis = 0;
        if (l == r) {
            currSub.add(arr[l]);
            dis = 1;
        }
        while (l - dis >= 0 && r + dis < arr.length) {
            if (arr[l - dis] == arr[r + dis]) {
                currSub.add(0, arr[l - dis]);
                currSub.add(arr[l - dis]);
            } else {
                break;
            }
            dis++;
        }
        
        StringBuilder builder = new StringBuilder(currSub.size());
        for(Character ch: currSub) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
