
import java.util.*;
public class IfELse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Even or Odd : ");
		
		int x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		System.out.println("Your Optput.");
	}

}
