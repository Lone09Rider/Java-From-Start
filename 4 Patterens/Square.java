
public class Square {

	public static void main(String[] args) {
		int x = 5;
		int i = 1;
		while(i <= x) {
			int j = 1;
			while (j <= x) {
				System.out.print("*");
				j = j+1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
