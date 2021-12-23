package cf;

import java.util.Scanner;

public class DemoTranslation {
	public static void main(String[] args) {
		int numCoins; 
		byte red; 
		System.out.print("How many coins left on the board?"); 
		numCoins = STDIN_SCANNER.nextInt();
		if(numCoins < 0 || numCoins > 9 ) {
			System.out.print("Invalid input.");
		}  else {
			System.out.print("Have you pocketed the red coin(y/n)?"); 
			red = (byte)nextChar(STDIN_SCANNER);
			if(red == 'y' || red == 'Y' ) {
				System.out.print("Your score is: " + (numCoins + 5));
			} else if(red == 'n' || red == 'N' ) {
				System.out.print("Your score is: " + numCoins);
			} else {
				
				System.out.print("Invalid input");
			}
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

	
	public final static int nextChar(Scanner scanner) {
		scanner.useDelimiter("");
		int ret = scanner.next().charAt(0);
		scanner.reset();
		return ret;
	}
}