package heap;

import java.util.Arrays;

public class MinHeap {
	private int capacity = 10;
	private int size = 0;
	
	int[] items = new int[capacity];
	
	private int getLeftChildIndex(int parentIndex){
		return parentIndex * 2 + 1;
	}
	
	private int getRightChildIndex(int parentIndex){
		return parentIndex * 2 + 2;
	}
	
	private int getParentIndex(int childIndex){
		return (childIndex - 1) / 2;
	}
	
	private boolean hasLeftChild(int index){
		return getLeftChildIndex(index) < size;
	}
	
	private boolean hasRightChild(int index){
		return getRightChildIndex(index) < size;
	}
	
	private boolean hasParent(int index){
		return getParentIndex(index) >= 0;
	}
	
	private int leftChild(int index){
		return items[getLeftChildIndex(index)];
	}
	private int rightChild(int index){
		return items[getRightChildIndex(index)];
	}
	private int parent(int index){
		return items[getParentIndex(index)];
	}
	
	private void swap(int a, int b){
		int temp = items[a];
		
		items[a] = items[b];
		
		items[b] = temp;
	}
	
	private void ensureExtraCapacity(){
		if(size == capacity){
			// Using built in method to copy array and increase the size
			items = Arrays.copyOf(items, items.length * 2);
			
			capacity = capacity * 2;
		}
	}
	
	// Check out what is the min
	public int peek(){
		if(size == 0){
			throw new IllegalStateException();
		}
		
		return items[0];
	}
	
	// remove min method
	public int poll(){
		if(size == 0){
			throw new IllegalStateException();
		}
		
		int removedItem = items[0];
		
		// Replace min with the last element of the array
		items[0] = items[size - 1];
		size--;
		
		heapifyDown();
		
		return removedItem;
	}
	
	public void add(int item){
		ensureExtraCapacity();
		
		items[size] = item;
		size++;
		
		heapifyUp();
	}
	
	// When we add an element, we need to see if it is a new min or not by going up and check
	private void heapifyUp(){
		// Since we checking if last element will be the new min or not
		int index = size - 1;
		
		while(hasParent(index) && parent(index) > items[index]){
			swap(getParentIndex(index),index);
			
			index = getParentIndex(index);
		}
	}
	
	// When we removed min, we replace the first element(min) with last element, need to make sure it is at the right place
	private void heapifyDown(){
		// Make sure to start at 0 since min is at the root
		int index = 0;
		
		while(hasLeftChild(index)){
			// Lets default to left child is smallest right now
			int smallerChildIndex = getLeftChildIndex(index);
			
			// If right child is actually smaller, make it right child
			if(hasRightChild(index) && rightChild(index) < leftChild(index) ){
				smallerChildIndex = getRightChildIndex(index);
			}
			
			// If first element is already min, stop the loop
			if(items[index] < items[smallerChildIndex]){
				break;
			} else {
				swap(index, smallerChildIndex);
				
				index = smallerChildIndex;
			}
		}
	}
}
