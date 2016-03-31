package com.tony.testTrees;

import java.util.List;

import org.junit.Test;

import com.tony.tree.BinarySearchTree;
import com.tony.tree.Node;

public class TestBinaryTree {

	BinarySearchTree bt = new BinarySearchTree();

	
	@Test
	public void testBTFlatten(){
		
		bt.insert(3);
		bt.insert(2);
		bt.insert(5);	
		bt.insert(1);
		bt.insert(6);
		bt.insert(4);
		
		System.out.println(bt.root);
		
		bt.flattenByStack(bt.root);
		
//		Node tree = bt.flatten(bt.root);
//		System.out.println(tree);
//		List list  = bt.preorderWrap(tree);
//		
//		System.out.println(list);
		
	}
	
	
	
	@Test
	public void testBT() {
		Node m1;
		m1 = null;
		System.out.println(m1 == null);
//		System.out.println(m1);
		// System.out.println(1);
		bt.insert(2);
		bt.insert(6);
		bt.insert(4);
		bt.insert(1);
		bt.insert(5);	
		bt.insert(3);

		System.out.println(bt.findMinimum());
		System.out.println(bt.finMaximum());
//		bt.preorderWrap(bt.root);
		List list = bt.preorderWrap(bt.root);

		 System.out.println(2*list.size()-1);
//		 System.out.println(bt.inorderWrap(bt.root));
//		 System.out.println(bt.postorderWrap(bt.root));
		 
		for (int i = 0; i < (2 * list.size() - 1); i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}

			if (i % 2 == 0 && i != 1) {

				if (i == 0) {
					System.out.println(list.get(i));
				} 
				else {
					System.out.println(list.get(i / 2));
				}
			} else {
				System.out.println("\\");
			}
		}

	}

}
