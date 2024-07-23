package Array;

public class Missing_no_in_Array {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,11,12,14,13,6,7,8,9,10};
		int n=arr.length+1;
		
		int form = n*(n+1)/2;
		System.out.println("The Formula will be:");
		for (int i : arr) {
			System.out.println(form+"-"+i);
			form=form-i;
		}
		System.out.println("Thè Missing Number is: "+form);
	}

}
