
public class ExplicitTypecasting {

	public static void main(String[] args) {
		char c = 'A';
//		System.out.println(c + 3);
		
		int i = c + 10;
//		System.out.println(i);
		
		
		long l = i;
//		l = 1234567891234567;  Error : Out of Range so,
		l = 12345678901234567l;
//		i = l;  Mismatch Error cannot convert long to int
		i = (int)l;
		System.out.println(l);
		System.out.println(i);
		i = 65;
		
//		char abc = i;  // Cannot convert int to char so explicit typecast
		char abc = (char)i;
		System.out.println(abc);
		
		

	}

}
