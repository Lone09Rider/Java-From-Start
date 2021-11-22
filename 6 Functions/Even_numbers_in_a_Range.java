
import java.util.*;
public class Even_numbers_in_a_Range {
	
	public static void find_even(int num) {
		for(int i= 1; i<= num; i++) {
			if(i%2 == 0) {
				System.out.println(i);			
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		find_even(n);

	}

}
