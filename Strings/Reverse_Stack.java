package String;
import java.util.*;
public class Reverse_Stack {

	public static void main(String[] args) {
		String str = "I am Ironman I am the LEGEND!!!";
		Stack<Character>st=new Stack<>();
		System.out.println("String(Before)");
		for (int i = 0; i < str.length(); i++) {
			char[] a=str.toCharArray();
			System.out.print(st.push(a[i])+" ");  
		}
		System.out.println();
		System.out.println("Reverse String(After):");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(st.pop()+" ");
		}
		
		
	}

}
