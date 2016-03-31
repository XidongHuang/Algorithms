package com.tony.tree;

public class Node<T> {
	public int val;
	public Node left;
	public Node right;
	
	public Node(int val){
		
		this.val = val;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
