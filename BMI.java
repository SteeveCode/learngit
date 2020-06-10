import java.util.Scanner;
public class BMI{
public static void main(String []args){
try (Scanner input = new Scanner(System.in)) {
	System.out.println("Enter weight in kg");
	double kg = input.nextInt();
	System.out.println("Enter height in cm");
	double height = input.nextInt();
	height = height/100;
	double bmi = kg/(height * height);
	if(bmi<18.5)
		System.out.println("You are underweight");
	else if(bmi>=18.5 && bmi<25)
		System.out.println("You are normal");
	else if (bmi>=25 && bmi<30)
		System.out.println("You are overweight");
	else if(bmi>30)
		System.out.println("You are OBESE");
	else 
		System.out.println("Incorrect BMI");
}


}
}