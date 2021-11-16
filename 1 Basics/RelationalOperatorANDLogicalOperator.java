
import java.util.*;
public class RelationalOperatorANDLogicalOperator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		boolean bj = (x<y);
		
		System.out.println("Is less than : " + bj);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println();
		System.out.println("Is x Greater : "+ ((x>y)&&(x>z)));
		System.out.println("Is x Greater : "+ ((x>y)||(x>z)));
		
	}

}
