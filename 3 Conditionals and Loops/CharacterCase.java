
import java.util.*;
public class CharacterCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		if(c >= 'A' && c <='Z') {
			System.out.println("Uppercase");
		}
		else if(c >= 'a' && c <='z') {
			System.out.println("Lowercase");
		}
		else {
			System.out.println("Not Character");
		}

	}

}
