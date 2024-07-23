package Array;

public class Second_max {
	public static void main(String[] args) {
		int[]arr= {100,200,450,100000,23,45,9, 5556,4332,2211};
		int max= Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				sec_max= max;
				max=arr[i];
			}
			else if(arr[i]>sec_max && arr[i]!=max) {
				sec_max=arr[i];
			}
		}
		System.out.println("MAX:"+max);
		System.out.println("SEC-MAX:"+sec_max);
		
	}

}
