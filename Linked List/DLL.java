package LinkedList;
import java.util.*;
public class DLL {
	private Node head;
	private Node last;
	private int size;
	
public DLL() {
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next= head;
		node.prev=null;
		if(head != null) {
			head.prev=node;
		}
		head = node;
	}
	
	public void display() {
		Node node = head;
		Node last =null;
		while(node!=null) {
			System.out.print(node.val+" -> ");
			last = node;
			node =node.next;
		}
		System.out.print("END");
		System.out.println();
		
		System.out.println("Reverse Of Node:");
		while(last != null) {
			System.out.print(last.val+" -> ");
			last = last.prev;
		}
		System.out.print("Start");
		System.out.println();
	}
	
	
	private class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
		public Node(int val) {
			this.val = val;
		}
	}

}
