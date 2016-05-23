/**
 * 
 */
package com.hackerrank.ds.linkedlists;

/**
 * @author agupt316
 *
 */
public class InsertNodeAtTail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list1  =  new Node(1, new Node(5,new Node(9,new Node(9,new Node(11,new Node(11,null))))));
		Node list2  =  new Node(2, new Node(3,new Node(6,null)));
		/*Node list1  =  new Node(15,null);
		Node list2  =  new Node(12,null);*/
		DoubleListNode node1 = new DoubleListNode();
		DoubleListNode node2 = new  DoubleListNode();
		DoubleListNode node3  = new DoubleListNode();
		node1.setData(2);
		node2.setData(4);
		node3.setData(6);
		node1.setNext(node2);
		node2.setPrev(node1);
		node2.setNext(node3);
		node3.setPrev(node2);
		node3.setNext(null);
		node1.setPrev(null);
		
		DoubleListNode node = NodeOps.reverse(node1);
		NodeOps.traverse(node);
		//NodeOps.traverse(node);
		//System.out.println(NodeOps.(list1, list2));
		
		//System.out.println(NodeOps.getNode(list1, 1));
	}

}
