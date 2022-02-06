import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		try (Scanner dharti = new Scanner (System.in)) {
			double fnum, snum, answer;
			System.out.println("Enter first num: ");
			fnum = dharti.nextDouble();
			System.out.println("Enter second num: ");
			snum = dharti.nextDouble();
			answer = fnum + snum;
			System.out.println(answer);
			
		}
	
	}

}
