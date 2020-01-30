package stack;

public class StackDynamicSize {
private int[] stack;
	private int capacity = 8;
	
	private int top;
	
	public StackDynamicSize() {
		stack = new int[capacity];
		top = 0;
	}
	
	public void extendStack(){
		int length = size();
		
		int[] newStack = new int[capacity * 2];
		
		System.arraycopy(stack, 0, newStack, 0, length);
		
		stack = newStack;
		
		capacity = capacity * 2;
	}
	
	public void push(int num){
		if(isFull()){
			extendStack();
		} else {
			stack[top] = num;
			top++;
		}
	}
	
	public int pop(){
		int data = 0;
		
		if(isEmpty()){
			System.out.println("Stack is empty, nothing to pop");
		} else {
			top--;
			
			data = stack[top];
			
			stack[top] = 0;
			
			// Not really needed
			shrinkStackSize();
		}
		
		return data;
	}
	
	public void shrinkStackSize(){
		int length = size();
		
		if(length <= (capacity / 2)/ 2){
			capacity = capacity/2;
		}
		
		int[] newStack = new int[capacity];
		
		System.arraycopy(stack, 0, newStack, 0, length);
		
		stack = newStack;
	}
	
	public int peek(){
		int data = 0;
		
		if(top == 0){
			System.out.println("Nothing to peek");
		} else {
			data = stack[top - 1];
		}
		
		return data;
	}
	
	public int size(){
		return top;
	}
	
	public void show(){
		
		for(int current : stack){
			System.out.print(current + " ");
		}
		
		System.out.println("\n");
	}
	
	public boolean isEmpty(){
		return top <= 0;
	}
	
	
	public boolean isFull(){
		return top == capacity;
	}
}
