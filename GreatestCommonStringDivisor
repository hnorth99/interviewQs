class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int aLen = str1.length();
        int bLen = str2.length();
        int shortIndex = Math.min(str1.length(), str2.length());
        if (shortIndex == 0) return "";
        String retval = "";
    
        //Get all the possible lengths of a divisor
        List<Integer> possLengths = new ArrayList<Integer>();
        for (int i = 1; i <= shortIndex; i++) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                possLengths.add(i - 1);
            }
        }
        
        //Find the largest possible length of substring
        int i = 0;
        while (i < aLen && i < bLen) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }
            i++;
        }
        //Remove values that are too large
        for(int j = 0; j < possLengths.size(); j++) {
            if (possLengths.get(j) > i) {
                possLengths.remove(j);
                j--;
            }
        }
        
        for (int len : possLengths) {
            String sub = str1.substring(0, len + 1);
            System.out.println(sub);
            if (isDivisor(str1, sub) && isDivisor(str2, sub)) {
                retval = sub;
            }
        }

        return retval;
    }

    private boolean isDivisor(String str, String div) {        
        int scalar = str.length() / div.length();
        String scaled = div;
        
        for (int i = 0; i < scalar - 1; i++) {
            scaled += div;
        }

        return scaled.equals(str);
    }
}
