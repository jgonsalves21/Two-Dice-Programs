/**
 * 
 * jgonsalves21
 * TargetGuesser
 * 
 */

import java.util.Scanner;

public class TargetGuesser {

	public static void main(String[] args) {
	
		DiceClass dice1 = new DiceClass();
		DiceClass dice2 = new DiceClass();
		Scanner in = new Scanner(System.in);
		
		int numRoll = 1;
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		
		System.out.println("Please input a number between and including 2 and 12: ");
		int guess = in.nextInt();
		in.nextLine();
		
		while (guess < 2 || guess > 12)
		{
			System.out.println("Your number is not within the constraints; please enter it again: ");
			guess = in.nextInt();
			in.nextLine();
		}
		
		
		
		while (guess != (roll1 + roll2))
		{
			
			numRoll ++;
	
			System.out.print("First Roll: " + roll1 + ", ");
			System.out.print("Second Roll: " + roll2 + ", ");
			System.out.println("Sum: " + (roll1+roll2));
			
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			
		}
		
			System.out.print("First Roll: " + roll1 + ", ");
			System.out.print("Second Roll: " + roll2 + ", ");
			System.out.println("Sum: " + (roll1+roll2));
			
			if ((roll1 + roll2) == 1)
			System.out.println("It took " + numRoll + " try to get your number!");
			
			else
				System.out.println("It took " + numRoll + " tries to get your number!");
		
		}
			
				
	}
	

