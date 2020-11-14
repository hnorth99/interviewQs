class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int leftOver = target - nums[i];
            
            if (map.containsKey(leftOver)) {
                int[] retval = new int[2];
                retval[0] = i;
                retval[1] = map.get(leftOver);
                
                return retval;
            } else {
                map.put(nums[i], i);
            }
        }
        
        return null;
    }
}
