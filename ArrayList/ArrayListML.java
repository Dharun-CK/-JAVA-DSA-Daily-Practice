package ArrayList;
import java.util.*;
public class ArrayListML {
public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> list= new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	
	for(int i = 0; i <3; i++) {
		list.add(new ArrayList<>());
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j <3; j++) {
			list.get(i).add(sc.nextInt());
		}
	}
	
	System.out.println(list);
}
}
