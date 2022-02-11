package Program;

import java.util.Scanner;

public class Learn {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Single singleObject = new Single ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		singleObject.simpleMessage(name);
		
		

	}

}
