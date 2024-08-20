package Array;

import java.util.*;

public class Array24 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	List<Integer> lst=new ArrayList<>();
	lst.add(100);
	lst.add(10);
	lst.add(20);
	lst.add(30);
	lst.add(40);
	Iterator<Integer>it=lst.iterator();
	while(it.hasNext()) 
		System.out.print(it.next()+" ");
	
	System.out.println();
	Set s = new TreeSet();
s.add(100);
s.add(20);
s.add(30);
s.add(40);
s.add(30);
	
	System.out.print(s+" ");
	System.out.println();
	Map<Integer,String>map=new HashMap<>();
	map.put(1, "Dharun");
	map.put(2, "Vishnu");
	map.put(3, "Meganath");
	map.put(4, "Sakthish");
	map.put(5, "Subash");
	System.out.print(map);
	System.out.println();
	System.out.println(map.get(4));
	System.out.println(map.keySet());
	System.out.println(map.values());
for(int i:map.keySet()) {
	System.out.println(i);
}
for(String str : map.values()) {
	System.out.println(str);
}
	
}

}