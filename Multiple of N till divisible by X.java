import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int X = sc.nextInt();
	    
		for(int i=1; i<=X; i++) {
		    int mul = i*N;
		    if(mul%X==0) {
		        System.out.print(mul+ " ");
		        break;
		    }
		    else {
		        System.out.print(mul+ " ");
		    }
		}
	}
}
