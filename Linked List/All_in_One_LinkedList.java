package Linked_List; 
import java.util.*;
 class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	
	public void insertFirst(int data) {
	Node node=new Node(data);
	node.next=head;
	head=node;
	if(tail==null) {
		tail=head;
	}
	size++;
	}
	
	public void insertMid(int data,int ind) {
		Node temp = head;
		if(ind ==0) {
			insertFirst(data);
			return;
			}
		if(ind == size) {
			insertLast(data);
			return;
			}
		for(int i=1;i<ind;i++) {
			temp = temp.next;	 
			}
		Node node =new Node(data,temp.next);
		temp.next=node;
		size++;
		}
	
	
	public void insertLast(int data) {
	Node node=new Node(data);
	if(tail==null) {
		insertFirst(data);
		return;
	}
	tail.next = node;
	tail =node;
	size+=1;
	
}
	
	
	public int deleteFirst() {
	int val=head.data;
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
	int data = tail.data;
	tail = secondLast;
	tail.next=null;
	return data;
	}
	
	public  int delete(int ind) {
	if(ind==0) {
		deleteFirst();
	}
	if(ind ==size-1) {
		deleteLast();
	}
	Node prev = get(ind-1);
	int data = prev.next.data;
	prev.next = prev.next.next;
	return data;
	}
	
	public Node find(int  data) {
	Node node = head;
	while(node!= null) {
		if(node.data==data) {
			return node;
		}
		node = node.next;
		}
	return null;
	}
	
	public void traversal() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
			}
		}

	public Node get(int index) {
	Node node = head;
	for(int i=0;i<index;i++) {
		node = node.next;
	}
	return node;
	}

	public class Node{
	 private int data;
	 private Node next;
	 
	public Node(int data) {
		this.data = data;
	}
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
}

}

public class All_in_One_LinkedList {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	LinkedList list1 = new LinkedList();
	
	Scanner sc = new Scanner(System.in);

	while(true) {
		int data = sc.nextInt();
		if(data==-1) {
			break;
		}
	list.insertLast(data);
	}
	list.traversal();
	//list1.deleteFirst();
	//list1.traversal();
	//System.out.println();
	//System.out.println();

}

}