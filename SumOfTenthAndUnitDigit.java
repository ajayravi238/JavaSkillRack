import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int unit = num%10;
	    int tenth = (num/10)%10;
	    
	    System.out.print(unit + tenth);
	}
}
