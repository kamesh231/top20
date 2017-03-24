package org.algorthmica.classroom.tree;

public class BinaryTreeNode {

	public BinaryTreeNode(Integer data, BinaryTreeNode left, BinaryTreeNode right) {
		// TODO Auto-generated constructor stub
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public BinaryTreeNode(Integer data) {
		super();
		this.data = data;
	}

	Integer data;
	BinaryTreeNode left;
	BinaryTreeNode right;
}
