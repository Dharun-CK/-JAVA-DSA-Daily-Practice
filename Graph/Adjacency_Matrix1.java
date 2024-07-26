package Graph;
public class Adjacency_Matrix1 {
	private int V;
	private int E;
	int[][]adjMat;
	public Adjacency_Matrix1(int nodes) {
		this.V=nodes;
		this.E=0;
		this.adjMat=new int[nodes][nodes];
	}
	
	public void addEdge(int u,int v) {
		this.adjMat[u][v]=1;
		this.adjMat[v][u]=1;
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V+":Vertices, "+ E + ":Edges "+"\n");
		for(int v=0;v<V;v++) {
			sb.append(V+":");
			for (int m : adjMat[v]) {
				sb.append(m+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[]args) {
		Adjacency_Matrix1 adj= new Adjacency_Matrix1(4);
		
		adj.addEdge(0,1);
		adj.addEdge(1,2);
		adj.addEdge(2,3);
		adj.addEdge(3,0);
		
		System.out.println(adj);
	}

	
	
	
	
}
