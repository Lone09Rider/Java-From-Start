
public class SquarewithNumbers {
	public static void main(String[] args) {
		int x = 5;
		int i = 1;
		
		for(i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(i);				
			}
			System.out.println();	
		}
		
		System.out.println();
		
		for(i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(j);				
			}
			System.out.println();	
		}
		
		System.out.println();
		
		for(i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(i+j+" ");				
			}
			System.out.println();	
		}
		
		System.out.println();
		
		for(i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(x-j+1);				
			}
			System.out.println();	
		}
	}

}
