class Solution {
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> retval = new ArrayList<Integer>();
        char[] str = S.toCharArray();
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) + 1);
            } else {
                map.put(str[i], 1);
            }
        }
        
        HashSet<Character> set = new HashSet<Character>();
        
        int counter = 0;
        for (int i = 0; i < str.length; i++) {
            char l = str[i];
            counter++;
            
            set.add(l);
            map.put(l, map.get(l) - 1);
            
            if (map.get(l) == 0) {
                if (checkSetZeros(map, set)) {
                    retval.add(counter);
                    counter = 0;
                    set.clear();
                }
            }
        }
        
        return retval;
        
    }
    
    private boolean checkSetZeros(HashMap<Character, Integer> map,
                                 HashSet<Character> set) {
        for (Character c : set) {
            if (map.get(c) > 0) {
                return false;
            }
        }
        return true;
    }
}
