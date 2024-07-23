package Array;

public class Resize_Arr {
	
	public static void main(String[] args) {
		int[]arr= {100,200,450,100000,23,45,9,5556,4332,2211};
		int c=5;
		System.out.println("Before Resize:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");		
			}
		
		resize(arr,arr.length+5);
	}
	public static void resize(int[]arr,int cap) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[]temp=new int[cap];
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		
		 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
			arr[i]=sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("After resize:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");		
			}
	
	}

}
