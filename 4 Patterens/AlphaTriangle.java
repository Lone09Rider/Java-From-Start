
public class AlphaTriangle {
	public static void main(String[] args)
	{

		int i = 1;
		while(i <= 5) {
			int j = 1;
			while(j <= i) {
				System.out.print((char)(i+64));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
