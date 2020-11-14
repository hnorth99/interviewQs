class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] retval = new int[n][n];
        
        int bumper = 0;
        int val = 1;
        while (bumper < n / 2) {
            //Movement A
            for (int c = bumper; c <= n - 1 - bumper; c++) {
                retval[bumper][c] = val;
                val++;
            }
            
            //Movement B
            for (int r = bumper + 1; r <= n - 1 - bumper; r++) {
                retval[r][n - 1 - bumper] = val;
                val++;
            }
            
            //Movement C
            for (int c = n - 2 - bumper; c >= bumper; c--) {
                retval[n - 1 - bumper][c] = val;
                val++;
            }
            
            //Movement D
            for (int r = n - 2 - bumper; r >= bumper + 1; r--) {
                retval[r][bumper] = val;
                val++;
            }
            
            //Move inward
            bumper++;
        }
        
        //Odd dimensional middle fill
        if (n % 2 == 1) {
            retval[n / 2][n / 2] = val;
        }
        
        return retval;
    }
}
