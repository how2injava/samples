package com.java.how2injava.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

	int data;

	TreeNode left, right;


	public TreeNode(int item) {

		data = item;

		left = right = null;

	}

}

public class BinaryTree {

	TreeNode root;

	public BinaryTree() {

		root = null;

	}

	public void insert(int val) {
		root = insertRecursive(root, val);
	}

	private TreeNode insertRecursive(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}

		if (val < root.data) {
			root.left = insertRecursive(root.left, val);
		} else if (val > root.data) {
			root.right = insertRecursive(root.right, val);
		}

		return root;
	}

	public void inorderTraversal(TreeNode root) {

		if (root != null) {

			inorderTraversal(root.left);

			System.out.print(root.data + " ");

			inorderTraversal(root.right);

		}

	}

	public void delete(int key) {
		root = deleteNode(root, key);
	}

	private TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return root;
		}

		if (key < root.data) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.data) {
			root.right = deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			root.data = minValue(root.right);

			root.right = deleteNode(root.right, root.data);
		}

		return root;
	}

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}

	private int minValue(TreeNode root) {
		int minVal = root.data;
		while (root.left != null) {
			minVal = root.left.data;
			root = root.left;
		}
		return minVal;
	}

	public void preorderTraversal(TreeNode root) {

		if (root != null) {

			System.out.print(root.data + " ");

			preorderTraversal(root.left);

			preorderTraversal(root.right);

		}

	}

	public int size(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return 1 + size(root.left) + size(root.right);
	}

	public void postorderTraversal(TreeNode root) {

		if (root != null) {

			postorderTraversal(root.left);

			postorderTraversal(root.right);

			System.out.print(root.data + " ");

		}

	}

	public void levelOrderTraversal(TreeNode root) {

		if (root == null) {

			return;

		}

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode current = queue.poll();

			System.out.print(current.data + " ");

			if (current.left != null) {

				queue.add(current.left);

			}

			if (current.right != null) {

				queue.add(current.right);

			}

		}

	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.insert(50);

		tree.insert(30);

		tree.insert(70);

		tree.insert(20);
		
		tree.insert(10);

		tree.insert(40);
		
		tree.insert(45);


		int size = tree.size(tree.root);

		System.out.println("Size of the binary tree:" + size);

		int height = tree.height(tree.root);

		System.out.println("Height of the binary tree:" + height);

		System.out.println("Inorder traversal of the binary tree:");

		tree.inorderTraversal(tree.root);

		System.out.println("");
		
		System.out.println("Pre traversal of the binary tree:");

		tree.preorderTraversal(tree.root);
		
		System.out.println("");
		

		System.out.println("Post traversal of the binary tree:");

		tree.postorderTraversal(tree.root);
		
		System.out.println("");

		System.out.println("Level order traversal of the binary tree:");

		tree.levelOrderTraversal(tree.root);

		tree.delete(10);

		System.out.println("");
		
		System.out.println("Inorder traversal of the binary tree after deleting element 10:");

		tree.inorderTraversal(tree.root);

	}

}
