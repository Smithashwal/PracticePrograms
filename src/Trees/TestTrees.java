package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.script.Bindings;

public class TestTrees {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(7);
		
		
		/*System.out.print("The inorder traversal of tree is: ");
		tree.printInOrder();
		System.out.println("\n-----------------------------");
		
		System.out.print("The preorder traversal of tree is: ");
		tree.printPreOrder();
		System.out.println("\n-----------------------------");
		
		System.out.print("The postorder traversal of tree is: ");
        tree.printPostOrder();
        System.out.println("\n-----------------------------");
        */
        System.out.println("The level order traversal of tree is: ");
        tree.levelOrder(tree.root);
        System.out.println("\n-----------------------------");
        
        /*System.out.println("The Top view of the tree is: ");
        tree.printTopView();
        System.out.println("\n-----------------------------");*/
        
        System.out.println("The bottom view of tree is: ");
        tree.bottomView(tree.root);
        System.out.println("\n-----------------------------");
        
    
        System.out.println("The left view of tree is: ");
        Queue<Node > q= new LinkedList<Node>();
        q.add(tree.root);
        tree.leftView(q);
        
        System.out.println("The right view of tree is: ");
        List<Node> list=new LinkedList<Node>();
        list.add(tree.root);
        tree.rightView(list);
	}

}
