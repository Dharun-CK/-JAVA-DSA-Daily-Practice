package Array;
import java.util.*;
public class SwapArr {
public static void main(String[] args) {
	int[]arr = {123,23,4556,78,9889,765,44};
	System.out.println(Arrays.toString(arr));
for(int i=arr.length-1;i>=0;i--){
	System.out.print(arr[i]+" ");
}
System.out.println();
	
	
	reverse(arr);
	//swap(arr,1,5);
System.out.println(Arrays.toString(arr));
}


static void  reverse(int[]arr) {
	int start =0;
	int end = arr.length-1;
	
	while(start<end) {
		swap(arr,start,end);
		start++;
		end--;
	}
}

static void swap(int[]arr,int ind1,int ind2) {
	int temp = arr[ind1];
	arr[ind1]=arr[ind2];
	arr[ind2]=temp;
}
}
