package Test;

public class Stack {

	int index = -1;
	int[] a = new int[100];

	public void push(int value) {
		if (index >= a.length) {
			System.out.println("Stack overflow");

		} else {
			index++;
			a[index] = value;
		}

	}

	public int pop() {
		int element=-1;
		if(index<0) {
			System.out.println("Stack underflow");
		}
		else {
			element = a[index];
			index--;
		}
		return element;
	}

	public int[] printArray() {
		for (int i = 0; i < index; i++) {
			System.out.println(a[i]);
		}
		return a;
	}

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(10);
		/*stack.push(9);
		stack.push(6);
		stack.push(57);
		stack.push(78);*/
		stack.printArray();

		System.out.println("popped element is :" + stack.pop());
		
		System.out.println("popped element is :" + stack.pop());

		stack.printArray();
	}

}
