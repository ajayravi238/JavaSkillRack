import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int i=X+1; i<Y; i++) {
		    if(i%2!=0) {
		        System.out.print(i + " ");
		    }
		}
	}
}
