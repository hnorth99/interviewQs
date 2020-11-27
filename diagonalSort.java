//Inefficent solution: missed i - j constant trick to heavily simplify and improve code

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int[][] retval = new int[mat.length][mat[0].length];
                
        int i = 0;
        int j = 0;
        while (i < mat.length) {
            j = 0;
            ArrayList<Integer> l = new ArrayList<Integer>();
            
            int m = i;
            int n = 0;
            while (n < mat[0].length && m < mat.length) {
                l.add(mat[m][n]);
                m++;
                n++;
            }
            
            Collections.sort(l);
            m = i;
            n = 0;
            while (n < mat[0].length && m < mat.length) {
                retval[m][n] = l.get(n);
                m++;
                n++;
            }
            i++;
        }
        
        i = 0;
        j = 1;
        while (j < mat[0].length) {
            i = 0;
            ArrayList<Integer> l = new ArrayList<Integer>();
            
            int m = 0;
            int n = j;
            while (n < mat[0].length && m < mat.length) {
                l.add(mat[m][n]);
                m++;
                n++;
            }
            
            Collections.sort(l);
            m = 0;
            n = j;
            while (n < mat[0].length && m < mat.length) {
                retval[m][n] = l.get(m);
                m++;
                n++;
            }
            j++;
        }
        
        return retval;
        
    }
}
