import java.util.Scanner;

public class RightTriangle{

public static void main(String []args){
System.out.println("Enter length of side 1: ");
Scanner input = new Scanner(System.in);
int side1= input.nextInt();

System.out.println("Enter length of side 2: ");
int side2= input.nextInt();

System.out.println("Enter length of side 3: ");
int side3= input.nextInt();

if((side1 > side2 && side1 > side3) && (side1*side1 == (side2*side2 + side3*side3))){
	System.out.printf("They form a right angled triangle and %d is the Hypotaenus", side1);
	}
else if 
	
	((side2 > side1 && side2 > side3) && (side2*side2 == (side1*side1 + side3*side3)))
		System.out.printf("They form a right angled triangle and %d is the Hypotaenus",side2);
	
	else if 
		((side3 > side2 && side3 > side1) && (side3*side3 == (side1*side1 + side2*side2)))
			System.out.printf("They form a right angled triangle and %d is the Hypotaenus", side3);
	
		else
			System.out.println("They do not form a right angled triangle"); 			
				

}

}