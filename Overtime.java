import java.util.Scanner;

public class Overtime {

public static void main(String []args){

System.out.println("Enter hours worked: ");
Scanner input = new Scanner(System.in);
double hoursWorked = input.nextDouble();
System.out.println("Enter hourly rate: ");
double hourlyRate = input.nextDouble();
double pay;
if(hoursWorked <= 40){
pay = hoursWorked * hourlyRate;
	}
else{
double overTime = (hoursWorked - 40) * (hourlyRate + (hourlyRate * 0.5));
pay = (40 * hourlyRate) + overTime;
	}
System.out.printf("Your total pay is: %.1f", pay);
}

}