package Test;

public class Queue {

	int[] a = new int[100];
	int index1 = -1, index2 = 0;

	public void add(int value) {
		if (index1 >= a.length) {
			System.out.println("Queue overflow");
		} else {
			index1++;
			a[index1] = value;
			
		}
	}

	public int pop() {
		int element = -1;
		if (index2 < 0) {
			System.out.println("Queue underflow");
		} else {

			element = a[index2];
			index2++;

		}
		return element;
	}

	public void printQueue() {
		for (int i = index2; i <= index1; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	/*public void  printQueuePop() {
		for(int j=0;j<=index2;j++) {
			System.out.println(a[j]);
		}
	}*/

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println("The queue is : ");
		queue.printQueue();

		System.out.println("The popped element is : " + queue.pop());
		
		System.out.println("The queue is : ");
		queue.printQueue();
		
		
		System.out.println("The popped element is : " + queue.pop());
		System.out.println("The popped element is : " + queue.pop());
		
		
	}

}
