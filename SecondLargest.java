import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int Smax = Integer.MIN_VALUE;
		for(int i=0; i<num; i++) {
		    int n = sc.nextInt();
		    if(n > max) {
		        Smax = max;
		        max = n;
		    }
		    else if(n > Smax && n != max) {
		        Smax = n;
		    }
		}
		System.out.print(Smax);
	}
}
