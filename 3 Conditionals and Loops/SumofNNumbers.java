
import java.util.*;
public class SumofNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = 0, j = 0;
		while (i <= x) {
			j = j + i;
			i = i + 1;
		}
		System.out.println(j);

	}

}
