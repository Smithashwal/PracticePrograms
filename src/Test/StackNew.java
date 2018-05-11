package Test;

public class StackNew {

	int[] a = new int[100];
	int index = -1;

	public void push(int value) {
		if (index >= a.length) {
			System.out.println("Stack Overflow");
		} else {
			index++;
			a[index] = value;
		}
	}

	public int pop() {
		int element = -1;
		if (index < 0) {
			System.out.println("Stack underflow");
		} else {
			element = a[index];
			index--;
		}
		return element;
	}

	public void printArray() {
		System.out.println("The array is : ");
		for (int i = 0; i <= index; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		StackNew stack = new StackNew();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		stack.printArray();

		System.out.println("The popped element is : " + stack.pop());
		stack.printArray();
	}

}
