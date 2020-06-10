import java.util.Scanner;

public class GasMile{

public static void main(String []args){

int miles;
int gallon;
double mpg;
int trip = 0;
int totalMiles = 0;
int totalGallon = 0;
double totalMpg = 0; 

Scanner input = new Scanner(System.in);
System.out.println("Enter trip 1 mileage (as integer) or -1 to quit:");
miles = input.nextInt();
while(miles != -1){
System.out.println("Enter trip 1 gallon (as integer):");
gallon = input.nextInt();
mpg = (double)miles/gallon;
++trip;
System.out.printf("Miles per gallon for trip %d is %f \n",trip, mpg);
totalMiles = totalMiles + miles;
totalGallon = totalGallon + gallon;
System.out.println("Enter miles or -1 to exit");
miles = input.nextInt();

}//while
totalMpg = (double)totalMiles + totalGallon;
System.out.printf("The combined miles per gallon for all trips is %f\n", totalMpg);

}//end main

}//end class 