package Array;
import java.util.*;
public class problem12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum =0;
	int size = sc.nextInt();
	int[]ans=new int[size];
	for(int i=0;i<size;i++) {
		ans[i]=sc.nextInt();
	}
	for(int i=0;i<ans.length;i++) {
		if(ans[i]==power1(ans[i]+1)){
		sum+=ans[i];
		}
	}	
	System.out.println(sum);
}
static int power1(int val) {
for(int i=0;i<val;i++) {
	int a=(int) Math.pow(2, i);
	if(a<val) {
		return a;
	}
}
	
return 0;	
}
}
