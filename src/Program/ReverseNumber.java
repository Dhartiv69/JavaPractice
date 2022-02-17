package Program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			
			int number, reminder, reverse;
			System.out.println("Please enter any number you want to reverse here: ");
			number = sc.nextInt();
			
			/*while(number != 0) {               // while loop for finding reverse number
			
			 reminder = number%10;
			 reverse = reverse*10 + reminder;
			 number = number/10;*/
			
			for (reverse = 0; number>0; number = number/10) {         //for loop for finding reverse number
				
				reminder = number % 10;
				reverse = reverse*10 + reminder;
				
			}
				System.out.println("Reverse Number : "+ reverse);
			}
			
			
		
}


