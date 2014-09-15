import java.util.Random;
import java.util.Scanner;

/*
 * @title: Largest Number
 * @name: Christian Pena
 * @version: 9/6/2014
 */
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number = Integer.parseInt(input);
		
		/* Creating the variables being used in the program */
		int play,input,largestNum,randomValue,counter;
		Random randomNum = new Random();
		largestNum = 0;
		input = 0;
		randomValue = 0;
		counter = 0;
		
		/* Creating a new scanner to read the user input */
		Scanner scanner = new Scanner(System.in);
		
		/* Asking users when to continue playing or quit */
		System.out.print("Type 1 to play or -1 to quit: ");
		
		/* taking user input to play game */
		play = scanner.nextInt();
		
		/* Checking if user has pressed int 1 or -1 */
		while(play >= 0) {
			randomValue = randomNum.nextInt(100); //setting randomValue to a random number from 0 to 100
			
			//System.out.print("Please choose a number from 0 to 100: ");
			/* Taking the user input and saving it to variable input */
			//input = scanner.nextInt();
			
			// should look into case switch for this issue
			
			/* Do while loops is used to check if user has picked a number within the range.
			 * This runs at least once */
			do {
				System.out.print("Please choose between 0 to 100: ");
				input = scanner.nextInt();
				if (input > 100) {
					counter = counter + 1;
					if(counter > 2) {
						System.out.println("you have reached enough attempts");
						input = -2;
					}
				}
			} while (input > 100);
			
			if(input == -2) {
				play = -1;
			} else {
				if(input > randomValue) {
					largestNum = input;
				} else {
					largestNum = randomValue;
				}
				System.out.print("continue playing? (1 or -1): ");
				play = scanner.nextInt();
			}
			/*
			if(input > randomValue) {
				largestNum = input;
			} else {
				largestNum = randomValue;
			}
			*/
		}
		
		if(input == -2) {
			System.out.println("Sorry game is over.");
		} else {
			System.out.println("you entered: " + input);
			System.out.println("computer entered: " + randomValue);
			System.out.println("largest number is: " + largestNum);
			if(input > randomValue) {
				System.out.println("you have won!");
			} else if (input < randomValue) {
				System.out.println("sorry computer has won!");
			} else {
				System.out.println("it was a tie!");
			}
			System.out.println("program terminated!");
			scanner.close();
		}
	}
}
