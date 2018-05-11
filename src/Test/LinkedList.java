package Test;

public class LinkedList {

	Node head;

	public Node addNode(Node node) {
		if (null == this.head) {
			this.head = node;
			return this.head;
		}

		Node temp = this.head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(node);

		return this.head;
	}

	public Node addNewNode(int data) {
		Node node = new Node();
		node.setData(data);
		return this.addNode(node);

	}

	public Node addAtPos(int data, int pos) {

		Node node = new Node();
		node.setData(data);
		int position = 1;
		Node temp = this.head;

		while (position < pos - 1) {
			temp = temp.getNext();
			position++;
		}

		Node temp1 = temp.getNext();
		temp.setNext(node);
		node.setNext(temp1);

		return this.head;

	}

	public void printNodes() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public Node reverseNodes() {
		Node prev = null;
		Node temp = this.head;
		Node next = null;

		while (temp.getNext() != null) {
			next = temp.getNext();
			temp.setNext(prev);
			prev = temp;
			temp = next;

		}
		temp.setNext(prev);
		return temp;
	}

	public void printreverseNodes(Node result) {
		Node temp = result;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	/*
	 * public Node deleteNode(Node node, int pos) { Node temp = this.head; int
	 * position = 1;
	 * 
	 * while (position < pos - 1) { temp = temp.getNext(); position++; }
	 * 
	 * if(null!=temp.getNext()) { //temp = temp.getNext(); Node temp1 =
	 * temp.getNext(); temp.setNext(temp1); }
	 * 
	 * return this.head;
	 * 
	 * }
	 */

	public void delete(int data) {
		Node temp = this.head;
		Node prev = null;
		if (temp != null && temp.getData() == data) {
			temp = temp.getNext(); 
			return;
		}

		while (temp != null && temp.getData() != data) {
			prev = temp;
			temp = temp.getNext();
		}

		if (temp == null)
			return;

		prev.setNext(temp.getNext());

	}

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		Node node = new Node();

		linkedList.addNewNode(10);
		linkedList.addNewNode(9);
		linkedList.addNewNode(26);
		linkedList.addNewNode(90);

		node.setData(32);
		node.setNext(null);
		linkedList.addNode(node);

		/*
		 * int pos = 2; linkedList.addAtPos(12, pos);
		 */

		// linkedList.printNodes();

		//Node result = linkedList.reverseNodes();
		//linkedList.printreverseNodes(result);

		/*
		 * int pos=3; linkedList.deleteNode(node, pos);
		 */

		linkedList.delete(32);
		linkedList.printNodes();

	}

}
