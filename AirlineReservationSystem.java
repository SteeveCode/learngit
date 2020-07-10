//(Airline Reservations System) A small airline has just purchased a computer for its new automated
//reservations system. You’ve been asked to develop the new system. You’re to write an application
//to assign seats on each flight of the airline’s only plane (capacity: 10 seats).

import java.util.Scanner;
public class AirlineReservationSystem {

	public static void main(String[] args) {
		Boolean [] seatArray = new Boolean[12];
		int planeSection;
		int seatCounterA = 0;
		int seatCounterB = 0;
		int loopCounter = 1;
		int fclassCounter = 1;
		int sclassCounter = 6;
		int limitA = 5;
		int limitB = 10;
		for(int i=0; i<seatArray.length; i++) {
			seatArray[i] = false;
			}
	
		
	Scanner input = new Scanner(System.in);
	while(loopCounter<=10) {
		System.out.println();
		System.out.println("Please type 1 for Firstclass and 2 for Economy.");
		
		
		planeSection = input.nextInt();
		if(planeSection == 1 || planeSection == 2) {
			if(planeSection == 1){
					if(seatArray[fclassCounter] != true && fclassCounter <=5) {
						seatArray[fclassCounter] = true;
						seatCounterA++;
						System.out.println("Your seat number in the firstclass section is "+fclassCounter);
						fclassCounter++;
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
					if(seatArray[sclassCounter] != true && sclassCounter <=10) {
						seatArray[sclassCounter] = true;
						seatCounterB++;
						System.out.println("Your seat number in the economy section is "+sclassCounter);
						sclassCounter++;
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