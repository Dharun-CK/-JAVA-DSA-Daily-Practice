package Array;

public class Min_Arr {

	public static void main(String[] args) {
		int[]arr= {100,200,450,100000,23,45,9,5556,4332,2211};
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
