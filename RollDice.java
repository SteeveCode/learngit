// Roll a six-sided die 6,000,000 times.
import java.util.*;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumber = new Random();// random number generator
		
		int frequency1 = 0;// maintains count of 1s rolled
		int frequency2 = 0;// count of 2s rolled
		int frequency3 = 0;// count of 3s rolled
		int frequency4 = 0;// count of 4s rolled
		int frequency5 = 0;// count of 5s rolled
		int frequency6 = 0;// count of 6s rolled
		int face;// most recently rolled value
		
		// tally counts for 6,000,000 rolls of a die
		for(int counter =1; counter<=6000;counter++) {
			face = 1 + randomNumber.nextInt(6);
			// determine roll value 1-6 and increment appropriate counter
			switch(face) 
			{
			case 1: ++frequency1;// increment the 1s counter
					break;
			case 2: ++frequency2;// increment the 1s counter
					break;
			case 3: ++frequency3;// increment the 1s counter
					break;
			case 4: ++frequency4;// increment the 1s counter
					break;
			case 5: ++frequency5;// increment the 1s counter
					break;
			case 6: ++frequency6;// increment the 1s counter
					break;// optional at end of switch
			}// end switch		
		}// end for
		
		System.out.printf("Face\tFrequency\n1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
	}// end main

}// end class RollDie
