import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		// declare variables
		int userNum;
		char loopContinue = 0;
		String integerType = null;

		{
		int i=0;	//kickstarts while loop due to i == 0 criteria
			
			while ((loopContinue == 'y') || (loopContinue == 'Y') || (i == 0)) {	// allows for either case
			
				// prompt
				System.out.print("Enter a number between 1 and 100: ");
				Scanner scan = new Scanner(System.in);		// can't close because loop
				userNum = scan.nextInt();
				
				// ensures userNum is integer between 1-100
				if ((userNum > 0) && (userNum <= 100)) {

					// odd
					if ((userNum % 2 == 1) && (userNum < 60)) {
						integerType = "Odd";
						System.out.println("Output: " + userNum + " and " + integerType);
					}

					else if ((userNum % 2 == 1) && (userNum > 60)) {
						integerType = "Odd and over 60";
						System.out.println("Output: " + userNum + " and " + integerType);
					}

					// even
					if ((userNum % 2 == 0) && (userNum < 25)) {
						integerType = "Even and less than 25";
						System.out.println(integerType);
					}

					else if ((userNum % 2 == 0) && (userNum > 25) && (userNum < 61)) {
						integerType = "Even";
						System.out.println(integerType);
					}

					else if ((userNum % 2 == 0) && (userNum > 60)) {
						integerType = "Even";
						System.out.println("Output: " + userNum + " and " + integerType);
					}
				}
				
				// userNum is 1-100 check
				else {
					integerType = "Sorry that's not a valid number. Try again!";
					System.out.println(integerType);
				}

				System.out.print("Continue? (y/n) ");
				loopContinue = scan.next().charAt(0);
				++i;
			}
		}
		System.out.println("Bye!");
		//scan.close();

	}
}
