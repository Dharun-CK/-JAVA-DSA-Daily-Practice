package String;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		String str="MALAYALAM";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		str=str.toLowerCase();
		//System.out.println(str);
		
		char[]a=str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int start = 0;
		int end=a.length-1;
		while(start<end) {
			if(a[start]==a[end]) {
				break;
			}
			start++;
			end--;
		}
		System.out.println(new String(a));
		
	}

}
