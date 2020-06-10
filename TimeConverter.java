import java.util.Scanner;
import java.io.*;

public class TimeConverter{

public static void main(String...args){

Scanner input = new Scanner(System.in);
System.out.println("Enter distance in km");

Double distance = 1000 * input.nextDouble();

System.out.println("Enter speed in km/hr");

Double speed =  1000/3600 * input.nextDouble();

Double total_time = distance/speed;

int hour = (int)(total_time/3600);

int min = (int)(total_time-hour*3600)/60;

int sec = (int)(total_time-hour*3600-min*60);

System.out.printf("The total time for the journey is %dhour %dmins and %dsec",hour,min,sec);
}
}