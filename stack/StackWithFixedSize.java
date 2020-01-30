package stack;

public class StackWithFixedSize {
	private int[] stack;
	
	private int top;
	
	public StackWithFixedSize(int size) {
		stack = new int[size];
		top = 0;
	}
	
	public void push(int num){
		if(isFull()){
			System.out.println("Stack is full");
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
		}
		
		return data;
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
		return stack.length;
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
		return top == size();
	}
}
