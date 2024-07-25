public class SkipCharacter {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println(skip(sc.nextLine()));
}


 static String skip(String str){
	if(str.isEmpty()) {
		return " ";
	}
	char ch = str.charAt(0);
	if(ch == 'a') {
		return skip(str.substring(1));
	}
	else{
		return ch+skip(str.substring(1));
	}
	
	
}
}
