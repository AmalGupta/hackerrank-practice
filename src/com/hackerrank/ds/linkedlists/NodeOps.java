/**
 * 
 */
package com.hackerrank.ds.linkedlists;



/**
 * 
 * @author agupt316
 */
public class NodeOps {

	/**
	 * Reverse a doubly linked list;
	 * @param head
	 * @return
	 */
	public static  DoubleListNode reverse(DoubleListNode head){
		if(head==null){
			return new DoubleListNode();
		}
		DoubleListNode current,trav;
		trav=current=head;
		DoubleListNode newHead=null;
		
		while(current!=null){
			if(newHead==null){
				newHead=  new DoubleListNode(); 
			    newHead.setData(current.getData());
			    newHead.setNext(null);
			    newHead.setPrev(null);
			}
			else{
				trav = new DoubleListNode();
				trav.setData(current.getData());
				newHead.setPrev(trav);
				trav.setNext(newHead);
				trav.setPrev(null);
				newHead = trav;
			}
			current = current.getNext();			
		}		
		return newHead;
	}
	
	/**
	 * Inserts a node in a sorted doubly linked list. The list is assumed to be sorted in ascending order the 
	 * min node at the head and the max node at the tail
	 * @param node
	 * @param data
	 * @return
	 */
	public static DoubleListNode sortedInsert(DoubleListNode head, int data){
		if(head==null){
			return new DoubleListNode();
		}
		DoubleListNode current = head;
		while(current!=null){
			//Insertion at head
			if((current==head)&&(data<current.getData())){
				return new DoubleListNode(data,null,current);
			}
			if((current.getNext()==null)&&(data>current.getData())){
				DoubleListNode endnode = new DoubleListNode(data, current, null);
				current.setNext(endnode);
				break;
			}
			if(current.getData()<=data&&current.getNext().getData()>data){
				DoubleListNode insertedNode = new DoubleListNode();
				insertedNode.setData(data);
				insertedNode.setNext(current.getNext());
				current.getNext().setPrev(insertedNode);
				current.setNext(insertedNode);
				insertedNode.setPrev(current);
				break;
			}
			current=current.getNext();
		}
		return head;
	}
	
	/**
	 * Finds the node where two linked lists merge
	 * @param headA
	 * @param headB
	 * @return
	 */
	public static int findMergeNode(Node headA, Node headB){
		if(headA==null||headB==null){
			return -1;
		}
		
		Node trav1 = headA;
		Node trav2 = headB;
		int len1, len2, diff;
		len1=len2=1;
		while(trav1!=null){
			trav1=trav1.getNext();
			len1++;
		}
		
		while(trav2!=null){
			trav2=trav2.getNext();
			len2++;
		}
		diff =  Math.abs(len2-len1);
		
		if(len1>len2){
			trav1 = headA;
			trav2 = headB;
		}
		else{
			trav1 = headB;
			trav2 = headA;
		}
			
		for(int i=0;i<diff;i++){
			trav1=trav1.getNext();
		}
		
		while(trav1!=trav2){
			trav1 = trav1.getNext();
			trav2 = trav2.getNext();
		}
		
		return trav1.getData();
	}
	
	/**
	 * finds whether there exists a cycle in the linked list. Uses Floyds Cycle finding algorithm. ( Tortoise and Hare algorithm )
	 * takes two pointers 
	 *    1 called tortoise - which moves through the list 1 node at a time
	 *    2nd Called hare - which moves through the list faster than 1. the cycle can  be detected if at any point in the traversal, tortoise = hare.
	 *  
	 * @param head
	 * @return 0 for no cycle, 1 for existence of a cycle
	 */
	public static int floydCycle(Node head){
		if(head==null){
			return 0;
		}
		
		Node tortoise, hare;
		tortoise = hare = head;
		while(hare!=null){
			tortoise = tortoise.getNext();
			if(hare.getNext()==null){
				break;
			}
			hare = hare.getNext().getNext();
			
			if(tortoise==hare){
				return 1;
			}
			
		}
		
		return 0;
		
	}
	
	/**
	 * Remove duplicates from a sorted list and return the head of the list
	 * @param head
	 * @return
	 */
	public static Node removeDuplicates(Node head){
		if(head==null){
			System.out.println("No elements to delete");
			return new Node();
		}
		
		Node current, prev;
		prev=current=head;
		while(current!=null){
			if((prev!=current)&&(prev.getData()==current.getData())){
				prev.setNext(current.getNext());
			}
			else{
				prev=current;
			}
			
			current = current.getNext();
		}
		
		return head;
	}
	
	/**
	 * Returns the node at the passed positionFromTail
	 * @param head
	 * @param positionFromTail
	 * @return
	 */
	public static int getNode(Node head, int positionFromTail){
		int listLength=0;
		Node current=head;
		while(current!=null){
			current=current.getNext();
			listLength++;
		}
		
		listLength--; //To adjust the error of the last null location;
		
		if(listLength<positionFromTail){
			System.out.println("Invalid position");
			return -1;
		}
		
		current=head;
		while(listLength>positionFromTail){
			current = current.getNext();
			listLength--;
		}
		
		return current.getData();
	}
	
	/**
	 * Merge two lists. The assumption is that the lists are in a sorted order 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public static Node mergeLists(Node headA, Node headB){
		/**Check if any of the head nodes is null*/
		Node current = new Node();
		if(headA==null&&headB==null){
			System.out.println("both lists null");
			current= new Node();
		}
		else if(headA==null){
			return headB;
		}
		else if(headB==null){
			return headA;
		}
		
		Node newList=current=headA;
		Node prev=null;
		while(headA!=null||headB!=null){
			if(headA==null){
				current=headB;		
				break;
			}
			else if(headB==null){
				current=headA;
				break;
			}
			else{
				if(headA.getData()<headB.getData()){
					current=headA;
					headA = headA.getNext();					
				}
				else{
					current=headB;
					headB = headB.getNext();
				}
			}
			if(prev==null){ 
				prev=current;
				newList=prev;
				prev.setNext(null);
			}
			else{
				prev.setNext(current);
				prev=current;
				prev.setNext(null);
			}
			current=current.getNext();
		}
		if(current!=null){
			prev.setNext(current);
			current.setNext(null);
		}
		return newList;
	}
	
	/**
	 * Compares two lists given the head node 
	 * @param headA
	 * @param headB
	 * @return 1 if lists are equal 0 if not equal or one/both of them are empty
	 */
	public static int compareLists(Node headA, Node headB){
		if(headA==null||headB==null){
			System.out.println("One or more lists empty");
			return 0;
		}
		
		//Assuming that the Lists are equal
		boolean flag = true;
		while(headA!=null&&headB!=null){
			if(headA.getData()!=headB.getData()){
				flag=false;
				break;
			}
			headA=headA.getNext();
			headB=headB.getNext();
		}
		
		if((headA==null)&&(headB==null)&&flag)
			return 1;		
		else
			return 0;
			
	}
	
	/**
	 * Reverse a linked list and return the reversed list.
	 * @param head
	 * @return
	 */
	public static Node reverse(Node head){
		if(head==null){
			System.out.println("No elements in the list");
			return new Node();
		}
		
		if(head.getNext()==null){
			return head;
		}
		else{
			Node reversed = reverse(head.getNext());
			reversed = insert(reversed, head.getData());
			return reversed;
		}
		
	}
	
	/**
	 * Prints a list in reverse. Does not return the reversed list. 
	 * @param head
	 */
	public static void reversePrint(Node head){
		if(head.getNext()==null){
			System.out.println(head.getData());
		}
		else{
			reversePrint(head.getNext());
			System.out.println(head.getData());
		}
	}
	
	/**
	 * delete a node at a given position.
	 * @param head
	 * @param position
	 * @return
	 */
	public static Node delete(Node head, int position){
		if(head==null){
			System.out.println("No elements to delete");
			return new Node();
		}
		if(position==0){
			return head.getNext();
		}
		
		int curPos = 0;
		Node current, previous;
		previous=current= head;
		while(curPos<position&& current!=null){
			previous = current;
			current = current.getNext();
			curPos++;
		}
		
		if(curPos>position){
			System.out.println("Not enough elements");
			return head;
		}
		
		if(current.getNext()!=null)
			previous.setNext(current.getNext());
		else
			previous.setNext(null);
		return head;
	}
	
	/**
	 * Insert at head
	 * @param head
	 * @param data
	 * @return
	 */
	public static Node insertHead(Node head, int data){
		return new Node(data,head);
	}
	
	/**
	 * Insert Element at nth Postion
	 * @param head
	 * @param data
	 * @param position
	 * @return
	 */
	public static Node insertNth(Node head, int data, int position){
		//Head
		if(position==0){
			return new Node(data,head);
		}
		
		//Other cases.
		int curPos = 0;
		Node newNode, prev, headTemp;
		headTemp = prev = head;
		while(curPos<position&&headTemp!=null){
			prev = headTemp;
			headTemp = headTemp.getNext();
			curPos++;
		}
		
		if(curPos>position){
	        System.out.println("Not enough elements in list");
	    }
		
		newNode = new Node(data,headTemp);
		prev.setNext(newNode);
		return head;
	}
	
	/**
	 * Insert at tail
	 * @param head
	 * @param data
	 * @return
	 */
	public static Node insert(Node head, int data){
		if(head==null){
			head = new Node();
			head.setData(data);
			head.setNext(null);
			return head;
		}
		else{
			head.setNext(insert(head.getNext(), data));
			return head;
		}
	}
	
	/**
	 * Traverse a list giving the head of a list
	 * @param head
	 */
	public static void traverse(Node head){
		if(head!=null){
			System.out.println(head.getData());
			traverse(head.getNext());
		}		
	}
	
	/**
	 * Traverse a doubly Linked list giving the head of a list
	 * @param head
	 */
	public static void traverse(DoubleListNode head){
		if(head!=null){
			System.out.println(head.getData());
			traverse(head.getNext());
		}		
	}
	
}
