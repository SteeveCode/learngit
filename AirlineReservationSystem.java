/** 
A small airline has just purchased a computer for its new automated reservation system. Write an 
application to assign seats on each flight of the airline's only plane (capacity: 10 seats).
Your application should display the following alternatives: 'Please type 1 for First class and please type 
2 for economy'. If the user types 1, your application should assign a seat in the first class section 
(seats 1-5), if he types 2 in the economy section ( seats 6-10). Your application should then display a 
boarding pass indicating the person's seat number and whether it's in the first-class or economy.
Use a 1 dimensional array of primitive type boolean to represent the seating chart of the plane. Initialize 
all the elements to false to indicate that all the seats are empty. As each seat is assigned, set the 
corresponding element of the array to true to indicate that the seat is no longer available. Your application
should never assign a seat that has already been assigned. When the economy section is full ask the person if 
it is acceptable to be placed in the first class section and vice versa. If yes make the appropriate seat 
assignment. If not, display the message 'next flight leaves in 3 hrs.
 */

import java.util.Scanner;
public class AirlineReservationSystem {

	public static void main(String[] args) {
		Boolean [] seatArray = new Boolean[11]; // create 10 seat numbers (array[0] will not be used).
		int planeSection;
		int seatCounterA = 0;
		int seatCounterB = 0;
		int loopCounter = 1;
		int firstClassCounter = 1;
		int secondClassCounter = 6;
		int limitA = 5;
		int limitB = 10;
		for(int i=0;  i<seatArray.length; i++) {
			seatArray[i] = false; // Empty seat indicated by false
			}
	
		
	Scanner input = new Scanner(System.in);
	while(loopCounter<=10) {
		System.out.println();
		System.out.println("Please type 1 for Firstclass and 2 for Economy.");
		
		
		planeSection = input.nextInt();
		if(planeSection == 1 || planeSection == 2) {
			if(planeSection == 1){
					if(seatArray[firstClassCounter] != true && firstClassCounter <=5) {
						seatArray[firstClassCounter] = true;
						seatCounterA++;
						System.out.println("Your seat number in the firstclass section is "+firstClassCounter);
						firstClassCounter++;
						if(seatCounterA == limitA && seatCounterB == limitB)
							break;
						}
					else {
						System.out.println("Firstclass section is full. \nWould you like to be placed in the econnomy class?"
								+ "\nIf yes press 1. If no press 2");
						int choice = input.nextInt();
						if(choice == 1) {
							continue;
							}
						else {
							System.out.println("Next flight leaves in 3 hours");
							break;
							}
					}
			}
		
			else {
					if(seatArray[secondClassCounter] != true && secondClassCounter <=10) {
						seatArray[secondClassCounter] = true;
						seatCounterB++;
						System.out.println("Your seat number in the economy section is "+secondClassCounter);
						secondClassCounter++;
						if(seatCounterA == limitA && seatCounterB == limitB)
							break;
						}
					else {
						System.out.println("Economy section is full. \nWould you like to be placed in the firstclass?\nIf yes press 1. If no press 2");
						int choice = input.nextInt();
						if(choice == 1)
							continue;
						else {
							System.out.println("Next flight leaves in 3 hours");
							break;
							}
						}
			}
		
		}
		loopCounter++;
		}
		System.out.println("Thank you for your patronage!!!");
	}
}