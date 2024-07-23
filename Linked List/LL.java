package LinkedList;
import java.util.*;
public class LL {
	private Node head;
	private Node tail;
	private int size;
	public LL() {
		this.size = 0;
		}
	public void insertFirst(int val) {
	Node node=new Node(val);
	node.next=head;
	head=node;
	
	if(tail==null) {
		tail=head;
	}
	size+=1;
   }
	
public void insertMid(int val,int ind) {
	Node temp = head;
	if(ind ==0) {
		insertFirst(val);
		return;
	}
	if(ind == size) {
		insertLast(val);
		return;
	}
	 for(int i=1;i<ind;i++) {
		 temp = temp.next;	 
	 }
	Node node =new Node(val,temp.next);
	temp.next=node;
	size++;
}


public void insertLast(int val) {
	Node node=new Node(val);
	if(tail==null) {
		insertFirst(val);
		return;
	}
	tail.next = node;
	tail =node;
	size+=1;
}

public int deleteFirst() {
	int val=head.val;
	head=head.next;
	if(head==null) {
		tail=null;
	}
	size--;
	return val;
}
public int deleteLast() {
	if(size<=1) {
		return deleteFirst();
	}
	Node secondLast  =get(size-2);
	int val = tail.val;
	tail = secondLast;
	tail.next=null;
	return val;
}
public  int delete(int ind) {
	if(ind==0) {
		deleteFirst();
	}
	if(ind ==size-1) {
		deleteLast();
	}
	Node prev = get(ind-1);
	int val = prev.next.val;
	prev.next = prev.next.next;
	return val;
}
public Node find(int  val) {
	Node node = head;
	while(node!= null) {
		if(node.val==val) {
			return node;
		}
		node = node.next;
	}
	return null;
}


public void display() {
Node temp = head;
while(temp!=null) {
	System.out.print(temp.val+" -> ");
	temp = temp.next;
}
System.out.print("END");
}



public Node get(int index) {
	Node node = head;
	for(int i=0;i<index;i++) {
		node = node.next;
	}
	return node;
}
private class Node{
	 private int val;
	 private Node next;
	 
	public Node(int val) {
		this.val = val;
	}
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
	
}

}

