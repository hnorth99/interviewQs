class Solution {
    public boolean buddyStrings(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        if (a.length != b.length) {
            return false;
        }
        
        ArrayList<Integer> difIndex = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                difIndex.add(i);
            }
        }
        System.out.println(difIndex);
        
        if (difIndex.size() == 2) {
            if (a[difIndex.get(0)] == b[difIndex.get(1)]) {
                if (a[difIndex.get(1)] == b[difIndex.get(0)]) {
                    return true;
                }
            }
            return false;
        }
        
        //check if there is a duplicate of the same letter
        if (difIndex.size() == 0) {
            Arrays.sort(a);
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] == a[i + 1]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
