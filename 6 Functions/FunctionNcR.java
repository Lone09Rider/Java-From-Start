
import java.util.*;
public class FunctionNcR {
	
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int factn = fact(n);
		int factr = fact(r);
		int factnr = fact(n-r);
		
		int result = factn/(factr * factnr);
		System.out.println(result);

	}

}
