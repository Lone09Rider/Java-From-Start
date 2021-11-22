
import java.util.*;
public class DivideNumbers {
	
	public static void Divide(int x, int y) {
		if (y == 0) {
			System.out.println("Invalid");
		}
		else {
			int j = x/y;
			
			System.out.println(j);
			System.out.println("Hope You got your Output");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		Divide(x1, x2);	}

}
