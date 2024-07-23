package Array;

public class remove_array {
	public static void main(String[] args) {
		int[]arr= {100,200,450,100000,23,45,9,5556,4332,2211};
		System.out.println("After Removing Odd Elements From the Array: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}	
	}
	
}
