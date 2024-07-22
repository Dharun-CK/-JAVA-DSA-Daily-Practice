package Array;

import java.util.*;

public class ArrayWithoutSize {
	public static void main(String[]args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[][]arr1={ {1,2,3,4},
				{5,6},
				{7,8,9,10},
				{11,23,45,67}
				};
		for(int row=0;row<arr1.length;row++) {
			for(int column =0;column<arr1[row].length;column++) {
				System.out.print(arr1[row][column]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int[] a:arr1) {
			System.out.println(Arrays.toString(a)+" ");
		}
	
		int max=0;
		int f=0;
		for(int[]a:arr1) {
			for(int i=0;i<a.length;i++){
				max=0;
			if(a[i]>max){
				max=a[i];
				}
			
		}

			System.out.println(max+"is Greater");
		}

		System.out.println(max+"is Most Greater in this array");
	}
}
