package org.algorthmica.classroom.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RBinaryTree {
	private BinaryTreeNode root;

	public BinaryTreeNode randomTree(int n) {
		BinaryTreeNode root = null;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int tmp = r.nextInt(n) + 1;
			if (root == null)
				root = new BinaryTreeNode(tmp);

			addElement(tmp);
		}
		return root;

	}

	private void addElement(int data) {                                                                           
		// TODO Auto-generated method stub
		BinaryTreeNode current = root;
		while (true) {

			if (Math.random() < 0.5) {
				// If left sub tree does not exist
				if (current.left == null) {
					current.left = new BinaryTreeNode(data);
					break;
				} else // Move to left sub node
					current = current.left;
			} else {
				if (current.right == null) {
					current.right = new BinaryTreeNode(data);
					break;
				} else // Move to right sub node
					current = current.right;
			}

		}

	}

	/**
	 * Algorithm or approach --> Adding each element to queue starting from root
	 * We will use 'null' as the marker to differentiate levels in the tree
	 */
	public void display() {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		queue.add(null);
		int level = 1;
		while (!(queue.isEmpty())) {
			// BinaryTreeNode current = queue.remove();
			int count = 0;
			if (count == level) {
				System.out.println();
				level *= 2;
				count = 0;
			} else {
				BinaryTreeNode current = queue.remove();
				++count;
				if (current == null) {
					System.out.println();
					if (!queue.isEmpty())
						queue.add(null);
				} else {
					System.out.print(current.data + " ");
					if (current.left != null)
						queue.add(root.left);
					if (current.right != null)
						queue.add(root.right);
				}

			}
		}

	}

}
