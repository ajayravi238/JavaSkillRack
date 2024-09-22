import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		int index = -1;
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) == ch) {
		        index = i;
		        break;
		    }
		}
		if(index == -1) {
		    System.out.print(str);
		}
		else {
		    for(int i=0; i<index; i++) {
		        System.out.print(str.charAt(i));
		    }
		}
	}
}
