package Practice;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.out.println("----------Multiplication Table---------");
		
		int a, n, c=0;
		
		for (n=1; n<=6; n++) {
			
			for (a=1; a<=6; a++) {
				
				c=a*n;
				
				System.out.print(c + " ");
			}
			
			System.out.println();
		}

	}

}
