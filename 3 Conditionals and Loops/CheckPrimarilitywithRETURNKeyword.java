
import java.util.*;
public class CheckPrimarilitywithRETURNKeyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		
	if(n>2)
		{
			while(i < n) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}
			else {
				System.out.println("Prime");
				return;
			}

		}
	}
	else if (n > 0 && n <= 2){
		System.out.println("Prime");
	}

	}

}
