
import java.util.*;
public class ScopeofVariable {

	public static void main(String[] args) {
		int a = 10;
		a = 100;
		System.out.println(a);
		
		if (a>=100) {
			int b = 20;
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); Will work only inside if

	}

}
