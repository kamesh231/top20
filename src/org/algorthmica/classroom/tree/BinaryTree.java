package org.algorthmica.classroom.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Kaamesh Algo to find a depth of a binary tree approach -> Use
 *         recursion to find out height TC -> ?? SC-> ??
 *
 */
public class BinaryTree {

	public static int treeDepth1(BinaryTreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			return 1;
		}

		int lh = treeDepth1(root.left);
		int rh = treeDepth1(root.right);

		return Math.max(lh, rh) + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		RBinaryTree rbt = new RBinaryTree();
		BinaryTreeNode tree1 = rbt.randomTree(n);

		System.out.println(treeDepth1(tree1));
	}

}
