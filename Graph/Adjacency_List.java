package Graph;
import java.util.LinkedList;

public class Adjacency_List {
private int V;
private int E;
private LinkedList<Integer>[]list;
public Adjacency_List (int nodes) {
	this.V=nodes;
	this.E=0;
	this.list = new LinkedList[nodes];
	for(int i=0;i<V;i++) {
		list[i]=new LinkedList<>();
	}
}

public void addEdge(int u,int v) {
	list[v].add(u);
	list[u].add(v);
	E++;
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(V+":Vertices"+E+" :Edges"+"\n");
	for(int v=0;v<V;v++) {
		sb.append(V+":");
		for(int m:list[v]) {
			sb.append(m+" ");
		}
		sb.append("\n");
	}
	return sb.toString();
}

public static void main(String[] args) {
	Adjacency_List g =new Adjacency_List(4);
	g.addEdge(0,1);
	g.addEdge(1,2);
	g.addEdge(2,3);
	g.addEdge(3,0);
	System.out.println(g);
}
	
}
