 package heap;

public class Main {
	public static void main(String[] args) {
		int[] nums = {4,3,56,2,1,5,6,7,8,10};
		
		MinHeap minHeap = new MinHeap();
	
		for(int i : nums){
			System.out.println("Added: " + i);
			minHeap.add(i);
		}
		
		System.out.println("Current min: " + minHeap.peek());
		
		System.out.println("Removed: " + minHeap.poll());
		
		System.out.println("Current min: " + minHeap.peek());
		
		System.out.println("---------------------------------------------------------");
		
		MaxHeap maxHeap = new MaxHeap();
	
		for(int i : nums){
			System.out.println("Added: " + i);
			maxHeap.add(i);
		}
		
		System.out.println("Current max: " + maxHeap.peek());
		
		System.out.println("Removed: " + maxHeap.poll());
		
		System.out.println("Current max: " + maxHeap.peek());
	}
}
