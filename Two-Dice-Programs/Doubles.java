/**
 * 
 * jgonsalves21
 * Doubles
 * 
 */

public class Doubles {

	public static void main(String[] args) 
	{
		DiceClass dice1 = new DiceClass();
		DiceClass dice2 = new DiceClass();
		
		
		int numRoll = 1;
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		
		while (roll1 != roll2)
		{
			
			numRoll ++;
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			
			
		}
		
		if (numRoll == 1)
		System.out.print("It took " + numRoll + " try to get a double!");
		
		else
			System.out.print("It took " + numRoll + " tries to get a double!");
	}
	
	

}
