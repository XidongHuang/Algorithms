package com.tony.tree;

import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.sound.sampled.LineListener;

public class BinarySearchTree {

	public Node root;

	public void insert(int value) {
		Node node = new Node<>(value);

		if (root == null) {
			root = node;
			return;
		}

		insertRec(root, node);

	}

	private void insertRec(Node latestRoot, Node node) {

		if (latestRoot.val > node.val) {

			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertRec(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRec(latestRoot.right, node);
			}
		}

	}

	public int findMinimum() {

		if (root == null) {

			return 0;
		}

		Node currNode = root;
		while (currNode.left != null) {

			currNode = currNode.left;
		}

		return currNode.val;
	}

	public int finMaximum() {

		if (root == null) {

			return 0;
		}

		Node currNode = root;
		while (currNode.right != null) {

			currNode = currNode.right;
		}

		return currNode.val;
	}

	public List<Integer> nodelist = new ArrayList<>();

	public List inorderWrap(Node currRoot) {

		if (currRoot == null) {
			return null;
		}
		inorderWrap(currRoot.left);
		nodelist.add(currRoot.val);
		inorderWrap(currRoot.right);
		return nodelist;
	}

	public List preorderWrap(Node currRoot) {
		// System.out.println(nodelist);
		if (currRoot == null) {

			return null;
		}
		nodelist.add(currRoot.val);
		preorderWrap(currRoot.left);
		preorderWrap(currRoot.right);
		// System.out.println(nodelist);
		return nodelist;
	}

	public List postorderWrap(Node currRoot) {

		if (currRoot == null) {
			return null;

		}

		postorderWrap(currRoot.left);
		postorderWrap(currRoot.right);
		nodelist.add(currRoot.val);

		return nodelist;
	}

	public Node flatten(Node froot) {

		if (froot == null) {

			return froot;
		}

		Node rtree = froot.right;
		System.out.println("---" + froot);
		if (froot.left != null) {

			froot.right = froot.left;
			froot.left = null;
			froot = flatten(froot.right);

		}

		if (rtree != null) {

			froot.right = rtree;
			froot = flatten(froot.right);

		}

		return froot;

	}

	public static Node p = null;

	public void flattenByStack(Node froot) {
		Stack<Node> stack = new Stack<Node>();
		p = froot;
		System.out.println(p);
		while (p != null || !stack.empty()) {
			System.out.println("---"+p);
			if (p.right != null) {

				stack.push(p.right);

			}

			if (p.left != null) {
				p.right = p.left;
				p.left = null;

			} else if (!stack.empty()) {

				Node temp = stack.pop();
				p.right = temp;

			}
			
			p = p.right;

		}

		System.out.println(p);

	}

}
