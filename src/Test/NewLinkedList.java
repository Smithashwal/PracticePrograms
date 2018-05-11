package Test;

public class NewLinkedList {

	Nodes head;

	public Nodes addNode(Nodes node) {
		if (null == this.head) {
			this.head = node;
			return this.head;
		}

		Nodes temp = this.head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(node);

		return this.head;
	}

	public Nodes addNodeData(int data) {
		Nodes node = new Nodes();
		node.setData(data);
		return this.addNode(node);
	}

	public void printNodes() {
		Nodes temp = this.head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public Nodes addNodePos(int data, int pos) {

		Nodes node = new Nodes();
		node.setData(data);
		Nodes temp = this.head;
		int position = 1;

		while (position < pos - 1) {
			temp = temp.getNext();
			position++;
		}

		Nodes temp1 = temp.getNext();
		temp.setNext(node);
		node.setNext(temp1);

		return this.head;

	}

	public Nodes reverseNode() {
		Nodes temp = this.head;
		Nodes prev = null;
		Nodes next = null;

		while (temp.getNext() != null) {
			next = temp.getNext();
			temp.setNext(prev);
			prev = temp;
			temp = next;
		}

		temp.setNext(prev);
		return temp;
	}

	public void printReverse(Nodes result) {
		Nodes temp = result;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public static void main(String[] args) {

		NewLinkedList linkedList = new NewLinkedList();

		Nodes node = new Nodes();
		node.setData(9);
		linkedList.addNode(node);

		Nodes node1 = new Nodes();
		node1.setData(20);
		linkedList.addNode(node1);

		linkedList.addNodeData(30);
		linkedList.addNodeData(40);
		linkedList.addNodeData(72);

		int pos = 3;
		linkedList.addNodePos(21, pos);
        
		System.out.println("The original string is : ");
		linkedList.printNodes();
		System.out.println("-----------------------------------------------");

		System.out.println("The reversed string is : ");
		Nodes result = linkedList.reverseNode();
		linkedList.printReverse(result);

	}

}
