import java.util.Scanner;
/*write a program that converts metres ti miles, feet and inches.
//note: the key to solving this type of problem is to first convert the original value //given to the smallest SI unit. Now that you have a base unit, convert the other units //to the base unit and begin to subtract from the value given till you get to the //smallest unit*/
public class InchesConverter {

public static void main(String[] args){
System.out.println("Enter distance in meters");
Scanner input = new Scanner(System.in);
Double meter = input.nextDouble();
Double meters_in = 39.37 * meter;
int miles = (int)(meters_in/63360);
int feet = (int)(meters_in-miles*63360)/12;
int inches = (int)(meters_in-miles*63360-feet*12);
int meter_ = (int)(meter*1);
System.out.printf("%d meters = %d miles %d feet %d inches",meter_, miles,feet,inches);

}
}