package ArrayList;

import java.util.*;

public class demoAL {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> lst =new ArrayList<>(10);
	lst.add(100);
	lst.add(101);
	lst.add(102);
	lst.add(103);
	lst.add(104);
	lst.add(105);
	lst.add(106);
	lst.add(107);
	lst.add(108);
	lst.add(109);
	lst.add(1091);
	lst.add(1092);
	lst.add(1093);
	lst.add(1094);
	lst.add(1095);
	lst.add(1096);
	lst.add(1097);
	System.out.println(lst.contains(1091));
	lst.set(0,99);
	lst.set(10,2);
	lst.remove(7);
	
	
	int min=10000000;
	
	for (int i = 0; i <lst.size(); i++) {
		if(lst.get(i)<min) {
			min=lst.get(i);
		}
		
	}
	System.out.println(min);
	
	System.out.println(lst);
}
}
