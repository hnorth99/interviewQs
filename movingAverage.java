class MovingAverage {
    Queue<Integer> vals;
    int sum;
    int maxSize;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        vals = new LinkedList<Integer>();
        sum = 0;
        maxSize = size;
    }
    
    public double next(int val) {
        if (vals.size() == maxSize) {
            sum -= vals.remove();
        }
        sum += val;
        vals.add(val);
        return (double) sum / vals.size();
    }
}
