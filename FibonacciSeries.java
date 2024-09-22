import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long first = 0, second = 1;
		if(num == 1) {
		    System.out.print(first);
		}
		else if(num > 1) {
		    System.out.print(first + " " + second + " ");
		}
		for(int i=0; i<num-2; i++) {
		    long sum = 0;
		    sum += first + second;
		    System.out.print(sum + " ");
		    first = second;
		    second = sum;
		}
	}
}
