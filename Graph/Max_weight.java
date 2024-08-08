package Juspay_Training;
import java.util.*;
public class Max_weight {
	public static void main(String[] args) {
		int N =23;
		Vector<Integer>Edges=new Vector<>();
		int[] Edges1= {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
	for (int i=0;i<N;i++){
		 Edges.add( Edges1[i]);    
	}
	System.out.println("Vector:");
	System.out.println(Edges);
	
	weight(Edges);
	
	}

	public static void weight(Vector<Integer> edges) {
		int min=Integer.MIN_VALUE;
		int res=-1;
		//vector<int>Weights(edges.size(),0);
		
	}
}
