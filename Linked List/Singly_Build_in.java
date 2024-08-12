package LinkedList;
import java.util.Collections;

import java.util.LinkedList;
public class Singly_Build_in {
	public static void main(String[] args) {	
 LinkedList<String> colors =new LinkedList<String>();
 
       colors.add("White");
       colors.add("Red");
       colors.add("Yellow");
       colors.add("Blue");
       colors.add("violet");
       colors.add("Blueviolet");
       System.out.println("LinkedList:"+colors);
       colors.add("grey");
       System.out.println(colors);
       colors.set(1, "Orange");
       colors.set(colors.indexOf("violet"), "Pink");
       System.out.println(colors);
       colors.addFirst("Manakatha");
       colors.addLast("Mersal");
       System.out.println(colors);
       System.out.println(colors.getFirst());
       System.out.println(colors.getLast());
      System.out.println( colors.get(5)); 
      System.out.println(colors.remove(0));
      System.out.println( colors.remove(6));
      System.out.println(colors.removeLast());
     System.out.println( colors.removeFirst());
      System.out.println(colors);
     
      for(int i=0;i<colors.size();i++) {
    	  System.out.print(colors.get(i)+" ");
      }
      Collections.reverse(colors);
     System.out.println("\n"+colors);
     
     
}
}
//addfirst(),addLast(),clear(),removeLast(),getFirst(),getLast(),set()
