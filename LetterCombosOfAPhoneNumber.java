class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<String>();
        Map<Character, Set<Character>> map = new HashMap<>();
        
        //fill map
        map.put('1', new HashSet<Character>(Arrays.asList('_')));
        map.put('2', new HashSet<Character>(Arrays.asList('a', 'b', 'c')));
        map.put('3', new HashSet<Character>(Arrays.asList('d', 'e', 'f')));
        map.put('4', new HashSet<Character>(Arrays.asList('g', 'h', 'i')));
        map.put('5', new HashSet<Character>(Arrays.asList('j', 'k', 'l')));
        map.put('6', new HashSet<Character>(Arrays.asList('m', 'n', 'o')));
        map.put('7', new HashSet<Character>(Arrays.asList('p', 'q', 'r', 's')));
        map.put('8', new HashSet<Character>(Arrays.asList('t', 'u', 'v')));
        map.put('9', new HashSet<Character>(Arrays.asList('w', 'x', 'y', 'z')));
        map.put('0', new HashSet<Character>(Arrays.asList(' ')));
        
        char[] input = digits.toCharArray();
        List<String> retval = new ArrayList<>();
        populate(retval, input, 0, map, "");
        return retval;
    }
    
    private void populate(List<String> retval, char[] input, int index, 
                     Map<Character, Set<Character>> map, String curr) {
        if (index == input.length) {
            retval.add(curr);
        } else {
            char currChar = input[index];
            Set<Character> possChars = map.get(currChar);
            for (char newChar : possChars) {
                curr += newChar;
                populate(retval, input, index + 1, map, curr);
                curr = curr.substring(0, curr.length() - 1);
            }
        }
    }
}
