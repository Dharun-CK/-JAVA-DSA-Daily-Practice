package Array;
import java.util.*;
public class ReverseArr {

	public static void main(String[] args) {
		
		int [] arr = {34,5,677,8,89,0};
		reverse(arr,0,arr.length-1);
	}
	public static  void  reverse(int[]arr,int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
