/**
 * 
 */
package com.hackerrank.ds.linkedlists;

/**
 * Node for doubly linked list operations.
 * @author agupt316
 *
 */
public class DoubleListNode {

	private int data;
	private DoubleListNode prev;
	private DoubleListNode next;
	
	public DoubleListNode() {
		// TODO Auto-generated constructor stub
	}
	
	public DoubleListNode(int data, DoubleListNode prev, DoubleListNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleListNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleListNode prev) {
		this.prev = prev;
	}
	public DoubleListNode getNext() {
		return next;
	}
	public void setNext(DoubleListNode next) {
		this.next = next;
	}
	
	
	
}
