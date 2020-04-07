package stack;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		StackWithFixedSize stack = new StackWithFixedSize(5);
		
		stack.push(2);
		stack.push(3);
		
		stack.show();
		
		stack.pop();
		stack.pop();
		
		stack.show();
		
		System.out.println(stack.peek());
		
		
		System.out.println("------------------------------");
		
		StackDynamicSize stack2 = new StackDynamicSize();
		
		stack2.push(2);
		
		stack2.push(2);
		stack2.push(2);
		stack2.push(2);
	
		
		stack2.show();
		
		System.out.println("--------------------------");
		
		Stack<String> stack3 = new Stack<>();
		
		stack3.push("a");
		
		stack3.add("b");
		
		stack3.add("c");
		
		stack3.remove(0);
		
		stack3.pop();
		
		System.out.println(stack3);
		
	}
}
