
import java.util.*;
public class FarhenitetoCelcius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
//		int c = (5/9)*(f-32);  Cannot do it
		int c = (5*(f-32))/9;
		System.out.println(c);

//		Or
		int cel = (int)((5.0/9)*(f-32));
		System.out.println(cel);
		
//		Or
		
		
	}

}
