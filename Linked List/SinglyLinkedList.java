package LinkedList;
class SinglyLinkrdList{
private Node head;
private static class Node {
private int data;
private Node next;
public Node(int data) {
	this.data = data;
	this.next =null;
}
}

public void print() {
	Node current = head;
	while(current!=null) {
		System.out.print(current.data+"-->");
		current = current.next;
	}
	System.out.print("null");
}

public int length() {
	int count=0;
	Node current = head;
	while(current!=null) {
		count++;
		current= current.next;
	}
	System.out.println();
return count;
}

public void insertfirst(int data) {
	Node n = new Node(data);
	n.next=head;
	head =n;
	print();
}

public void insertMid(int data,int pos) {
	Node mid = new Node(data); 
	if(pos==0) {
		mid.next=head;
		head =mid;		
	}
	else {
		Node prev = head;
		int count=1;
		while(count<pos-1) {
			prev = prev.next;
			count++;
		}
		Node curr = prev.next;
		mid.next=curr;
		prev.next=mid;
		System.out.println();
		print();
	}
	
}

public void insertLast(int data) {
	Node last = new Node(data);
	int length = length();
	Node prev = head;
	int count=1;
	while(count<length) {
		prev = prev.next;
		count++;
	}
	Node curr = prev.next;
	last.next=curr;
	prev.next=last;
	System.out.println();
	print();
}

public static void main(String[] args) {
	SinglyLinkrdList sll= new SinglyLinkrdList();
	sll.head= new Node(10);
	Node one = new Node(20);
	Node two = new Node(30);
	Node third = new Node(40);
	Node four = new Node(50);
	
	sll.head.next=one;
	one.next=two;
	two.next=third;
	third.next=four;
	sll.print();	
	System.out.println("The Length: "+sll.length());
	sll.insertfirst(45);
	sll.insertMid(100,2);
	sll.insertLast(20000);
}
}