package Binary_Tree;
public class BinarySample {
	private TreeNode root;
	
 private  class TreeNode  {
	 private int data;
	 private TreeNode left;
	 private  TreeNode right;
	 
	 public TreeNode(int data) {
		this.data = data;
	}
 }
 
 public  void CreateBinaryTree() {
	 TreeNode node =new TreeNode(10);
	 TreeNode node1 =new TreeNode(98);
	 TreeNode node2 =new TreeNode(99);
	 TreeNode node3 =new TreeNode(90);
	 TreeNode node4 =new TreeNode(50);
	 TreeNode node5 =new TreeNode(60);
	 TreeNode node6 =new TreeNode(70);
	 root = node;
	 node.left=node1;
	 node.right=node2;
	 node1.left=node3;
	 node1.right=node4;
	 node2.left=node5;
	 node2.right=node6;	 
 }
 
 public void PreOrder(TreeNode root ) {
	 if(root==null) {
		 return;
	 }
	 System.out.print(root.data+" ");
	 PreOrder(root.left);
	 PreOrder(root.right);
 }
 
 

 public void PostOrder(TreeNode root ) {
	 if(root==null) {
		 return;
	 }
	 PostOrder(root.left);
	 PostOrder(root.right);
	 System.out.print(root.data+" ");
 }
 
 

 public void InOrder(TreeNode root ) {
	 if(root==null) {
		 return;
	 }
	 PostOrder(root.left);
	 System.out.print(root.data+" ");
	 PostOrder(root.right);
	 
 }
 public int length(TreeNode root) {
	if(root==null) {
		return 0;
	}
	int lcount = length(root.left); 
	int rcount = length(root.right); 
	return lcount+rcount+1;
 }
 
 public static int maxt(TreeNode root) {
	if(root==null) {
		return Integer.MIN_VALUE;
	}
	int lmax=maxt(root.left);
	int rmax=maxt(root.right);
	return Math.max((Math.max(lmax,rmax)),root.data);
 }
 

 public static void main(String[] args) {
	 BinarySample tree = new BinarySample();
	 tree.CreateBinaryTree();
	 System.out.print("PreOrder:");
	 tree.PreOrder(tree.root);
	 System.out.println();
	 System.out.print("PostOrder:");
	 tree.PostOrder(tree.root);
	 System.out.println();
	 System.out.print("In-Order:");
	 tree.InOrder(tree.root);
	 System.out.println();
	 System.out.print("Length/Size: ");
	int size= tree.length(tree.root);
	System.out.print(size);
	System.out.println();
	System.out.print("Max: ");
	int maxt= maxt(tree.root);
	System.out.print(maxt);
	
}
 
}