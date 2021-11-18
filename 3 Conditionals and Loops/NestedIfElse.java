
import java.util.*;
public class NestedIfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Both Positive");
		}
		
		else if (x > 0 && y < 0) {
			System.out.println("Only x Positive");
		}
		else if (x < 0 && y > 0)
		{
			System.out.println("Only y Positive");
		}
		else
		{
			System.out.println("Both Negetive");
		}
		
	}

}
