package Array;
import java.util.*;
public class demoArray1 {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int size = sc.nextInt();
	String uv="";
	int[][]arr=new int[size][size];
	for(int row=0;row<size;row++) {
		for(int column=0;column<size;column++) {
			arr[row][column]=sc.nextInt();
		}
	}
	System.out.println("Ouptpt:");
	for(int row=0;row<size;row++) {
		for(int column=0;column<size;column++) {
			System.out.print(arr[row][column]+" "); 
		}
		System.out.println();
	}
	System.out.println("E.Output:");
	for(int[] a :arr) {
		System.out.println(Arrays.toString(a)+" ");
	}
	
	System.out.println("Search::");

	do {
	System.out.println("Enter Search:");
	int target = sc.nextInt();	
	System.out.println(Arrays.toString(Search(arr,target)));
	System.out.println("Enter yr choice(y/n");
	uv=sc.next();
}while(uv.equals("y"));
	
	System.out.println("Reverse:");
	for(int row=size-1;row>=0;row--) {
		for(int column=size-1;column>=0;column--) {
			arr[row][column]=sc.nextInt();
		}
	}
}


public static int[]Search(int[][]arr,int target){
	int row=0;
	int column=arr.length-1;
	while(row<arr.length && column>=0) {
		if(arr[row][column]==target) {
			return new int[]{row,column};
		}
		if(arr[row][column]<=target) {
			row++;
		}
		else {
			column--;
		}		
		}
	return new int[]{-1,-1};
	}
	
}
