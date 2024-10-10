import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String str = "";
		str += S.substring(0, 2) + S.substring(S.length()-2, S.length());
		System.out.println(str);
	}
}
