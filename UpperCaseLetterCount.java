import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
		        count++;
		    }
		}
		System.out.print(count);
	}
}
