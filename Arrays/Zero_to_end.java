package Array;

public class Zero_to_end {

	public static void main(String[] args) {
		int arr[]= {0,1,2,4,0,11,90,45,0,3,0,0,101};
	
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0 && arr[j]==0) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		if(arr[j]!=0) {
			j++;
		}
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	}

}
