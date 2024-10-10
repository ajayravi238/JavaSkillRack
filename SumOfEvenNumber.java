import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
		    int a = Character.getNumericValue(str.charAt(i));
		    if(a%2==0) {
		        sum += a;
		    }
		}
		System.out.println(sum);
	}
}
