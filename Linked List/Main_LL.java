package LinkedList;
import java.util.*;
public class Main_LL {
	public static void main(String[] args) {
		
	LL list=new LL();
	System.out.println("Insert :");
	list.insertFirst(10);
	list.insertFirst(20);
	list.insertFirst(30);
	list.insertFirst(40);
	list.insertFirst(50);
	list.insertFirst(60);
	list.insertFirst(70);
	list.insertFirst(80);
	list.display();
	System.out.println();
	System.out.println("Insert Last:");
	list.insertLast(1000);
	list.display();
	System.out.println();
	System.out.println("Insert Middle:");
	list.insertMid(9999999, 4);
	list.display();
	System.out.println();
	System.out.println("Deleted First:"+list.deleteFirst());
	
	list.display();
	System.out.println();
	System.out.println("Deleted Last:"+list.deleteLast());
	list.display();
	System.out.println();
	System.out.println(list.delete(3));
	list.display();
	System.out.println();
	System.out.println(list.find(60));
	
	}
	
}
