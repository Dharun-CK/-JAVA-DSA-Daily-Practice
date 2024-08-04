package Graph;
import java.util.*;
public class Scaler_AdjacencyList {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in); 
	List<List<Integer>> list =new ArrayList<>();
	 int n =sc.nextInt();
	 int m=sc.nextInt();
	 
	 for(int i=0;i<n;i++) {
		 list.add(new ArrayList<>());
	 }
	 
	 for(int i=0;i<m;i++) {
		 int u=sc.nextInt();
		 int v =sc.nextInt();
		 
		 list.get(u).add(v);
		 list.get(v).add(u);
		  
	 }		 
}
}
