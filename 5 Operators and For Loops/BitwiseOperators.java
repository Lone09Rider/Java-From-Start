
public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 10, b = 2;
		int c = a & b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
		c = a ^ b;
		System.out.println(c);
		System.out.println(~a);
		System.out.println(a >> 2); // 10/(n)^2
		System.out.println(a << 3); // 10 x (2)^n
	}
}
