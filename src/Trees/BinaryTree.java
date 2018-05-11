package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

	Node root;
	int value;

	BinaryTree() {
		root = null;
	}

	public void inOrder(Node root) {
		if (null == root)
			return;

		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
	}

	public void printInOrder() {
		inOrder(root);
	}

	public void preOrder(Node root) {
		if (null == root)
			return;

		System.out.print(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void printPreOrder() {
		preOrder(root);
	}

	public void postOrder(Node root) {
		if (null == root)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data);
	}

	public void printPostOrder() {
		postOrder(root);
	}

	public void levelOrder(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		System.out.println(root.getData());

		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			if (null != temp.getLeft()) {
				System.out.println(temp.getLeft().getData());
				queue.add(temp.getLeft());
			}
			if (null != temp.getRight()) {
				System.out.println(temp.getRight().getData());
				queue.add(temp.getRight());
			}
		}

	}

	public void printLevelOrder() {
		levelOrder(root);
	}

	public void topView(Node root, int value) {
		if (root == null)
			return;

		System.out.println(root.data);

		if (value == 0) {
			topView(root.left, 0);
		} else {
			topView(root.right, 1);
		}

	}

	public void printTopView() {
		System.out.println(root.data);
		topView(root.left, 0);
		topView(root.right, 1);
	}

	public void bottomView(Node root) {

		if (root == null)
			return;
		if (null == root.left && null == root.right) {
			System.out.println(root.getData());
		}

		bottomView(root.getLeft());
		bottomView(root.getRight());

	}

	public void leftView(Queue<Node> q1) {
		if (q1.isEmpty())
			return;

		Queue<Node> q2 = new LinkedList<Node>();
		Node node = q1.peek();
		System.out.println(node.getData());
		while (!q1.isEmpty()) {

			Node temp = q1.poll();

			if (null != temp.getLeft()) {
				q2.add(temp.getLeft());
			}
			if (null != temp.getRight()) {
				q2.add(temp.getRight());
			}
		}

		leftView(q2);

	}

	public void rightView(List<Node> q1) {
		if (q1.isEmpty())
			return;

		List<Node> q2 = new LinkedList<Node>();
		Node node = q1.get(q1.size()-1);
		System.out.println(node.getData());
		for(int i=0; i<q1.size();i++) {

			Node temp = q1.get(i);

			if (null != temp.getLeft()) {
				q2.add(temp.getLeft());
			}
			if (null != temp.getRight()) {
				q2.add(temp.getRight());
			}
		}

		rightView(q2);

	}

}
