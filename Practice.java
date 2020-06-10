import java.util.Scanner;

public class Practice {

public static void main(String[] args){

Scanner input = new Scanner(System.in);
double totalMilesGallon = 0;
System.out.println("Enter miles or -1 to quit");
int miles = input.nextInt();
System.out.println("Enter gallon");
int gallon = input.nextInt();
while(miles != -1){
	double milesGallon = (double) (miles/gallon);
	totalMilesGallon = totalMilesGallon + milesGallon;
	System.out.println("The miles per gallon for this trip is "+milesGallon);

	System.out.println("Enter miles or -1 to quit");
	miles = input.nextInt();
	System.out.println("Enter gallon");
	gallon = input.nextInt();
}
System.out.println("The total miles per gallon for all trip is "+ totalMilesGallon);
}
}