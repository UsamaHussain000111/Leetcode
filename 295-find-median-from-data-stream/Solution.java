class MedianFinder {
    
    PriorityQueue<Integer> min = new PriorityQueue<Integer>();
    PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(min.size() > max.size()){
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size() > min.size()) return max.peek();
        return (min.peek() + max.peek()) / 2.0d;
    }
    
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */