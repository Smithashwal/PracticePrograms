package Trees;

public class Node {

	Node left, right;
	int data;
	
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public void setLeft(Node left) {
		this.left=left;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public void setRight(Node right) {
		this.right=right;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data=data;
	}
}
