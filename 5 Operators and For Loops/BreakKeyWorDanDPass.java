
public class BreakKeyWorDanDPass {

	public static void main(String[] args) {
		int  i = 20;
		for(int j = 1; j <= i; j++) {
			System.out.println(j);
			if (j == 9) {
				break;
			}
		}
		System.out.println("Out of Loop");
		
		int n = 5;
		int j = 0;
		while (i <= n) {
			i++;
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
