
public class Operators {

	public static void main(String[] args) {
		System.out.println(9/5);
		System.out.println(9.0/5.0);
		System.out.println(9.0/5);
		
		System.out.println();

		System.out.println(9.0+5.0);
		System.out.println(9.0-5.0);
		System.out.println(9.0/5.0);
		System.out.println(9.0*5.0);
		System.out.println();
		System.out.println(9.0%5.0);
		System.out.println();
//		ASCII value +, - , / and * with numbers
		System.out.println('A'+1);
		System.out.println('A'*5);
		System.out.println('A'-5);
		System.out.println('A'/5);
		System.out.println();
//		ASCII value +, - , / and * with another ASCII		
		System.out.println('A'+'B');
		System.out.println('A'*'B');
		System.out.println('A'-'B');
		System.out.println('A'/'B');
		System.out.println();
//		Type casting also Possible
		System.out.println((int)('A'));
		
	
		char c = 'a';
		char i = (char)(c + 3);
		System.out.println(i);
	}

}
