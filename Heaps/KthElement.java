package Heaps;
import java.util.*;
public class KthElement {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,11,78,99,4};
		int k =3;
		kthElement(arr,k);
	}
	public static void kthElement(int[]arr,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i=0;
		while(i<k) {	
			pq.add(arr[i]);
			i++;
		}
		//Check priority
		while(i<arr.length) {
			if(arr[i]>pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}else {
				
			}
			i++;
		}
		
		while(pq.size()>0) {
			System.out.print(pq.remove()+" ");
		}
	} 

}
