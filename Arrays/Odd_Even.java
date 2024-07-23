package Array;

public class Odd_Even {
	public static void main(String[] args) {
		int[]arr= {100,200,3,5,3450,100000,23,45,9,5556,4332,2211};
		int[]odd= new int[arr.length]; 
		int[]even= new int[arr.length]; 
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0)
			odd[i]= arr[i];	
		else 
			even[i]=arr[i];
		}
		System.out.println("The Odd:");
		for (int i = 0; i < odd.length; i++) {
			if(odd[i]!=0)
			System.out.print(odd[i]+" ");
		}
System.out.println();
		System.out.println("Even are:");
		for (int i = 0; i < even.length; i++) {
			if(even[i]!=0)
			System.out.print(even[i]+" ");
		}
	
	}
}
