package heap;

//https://leetcode.com/problems/find-median-from-data-stream/
public class FindMedianfromDataStream {
    public MedianFinder() {
        
    }

	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public void addNum(int num) {
		maxHeap.add(num);
		minHeap.add(maxHeap.poll());
		if (maxHeap.size() < minHeap.size())
			maxHeap.add(minHeap.poll());
	}

	public double findMedian() {
		if (maxHeap.size() > minHeap.size())
			return maxHeap.peek();
		else
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
	}
}
