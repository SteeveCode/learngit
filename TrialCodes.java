import java.util.Scanner;

public class TrialCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number to find its factorial: ");
		Scanner input = new Scanner(System.in);
		
		int fac = 1;
		int num = input.nextInt();
		int size = num;
		
		for(int i=1; i<=num; i++) {
			fac = fac * size;
			size--;
		}
		
		System.out.println("The factorial of "+num+" is "+fac );
		System.out.println();
		
		// prime number.
		//NOTE: I had a difficult time writing this algorithm. I was trying to test too many condition and statement within an if-else statement. 
		// 1. I was testing the condition for prime number
		// 2. Link the "continue statement" and a "is prime number printer statement" in the same block if condition block.
		// 3. Link the print out a "is not prime number printer statement" and a "break statement".
		// The eventual solution was initialising a boolean variable "isPrime" to "true" and then test for the condition for prime numbers. I put the 
		// "continue statement" in the body of the if statement while I reset the boolean value to false if it fails in the body of the else statement.
		
		
		
		boolean isprime = true;
		
		for(int i=2; i<num; i++) {
			if(num%i != 0) {
				continue ;
				}
			else {
			isprime = false;
			break;
			}
		}
		
		if(isprime == true)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
		
		// Calculate the average of N numbers
		
		System.out.print("Enter a number or -1 to exit: ");
		int numList = input.nextInt();
		int sum = 0;
		int frequency = 0;
		while(numList != -1) {
			sum = sum + numList;
			frequency++;
			numList = input.nextInt();	
		}
		double average = (double)sum/frequency;
		System.out.println("Average  is "+average);
		
		// Code to call a string representation of an object using toString()
		StringObj strObj = new StringObj("Bola", "Male", "Banker", 35);
		//strObj.toString();
		System.out.println(strObj);
		System.out.println(strObj.toString());
		System.out.println("Hello "+strObj);
		
		
	}

}


class StringObj{
	String name;
	String sex;
	String occupation;
	int age;
	
public StringObj(String name, String sex, String occupation, int age) {
	this.name = name;
	this.sex = sex;
	this.occupation = occupation;
	this.age = age;
	}


public String getName() {
	return name;
}

public String getSex() {
	return sex;
}

public String getOccupation() {
	return occupation;
}

public int getAge() {
	return age;
}

@Override
public String toString() {
	
	return String.format("Name: %s, Sex: %s, Occupation: %s, Age: %d, ", name,sex,occupation,age);
}


/*public String toString() {
	
	return String.format("Name: %s, Sex: %s, Occupation: %s, Age: %d, ", getName(),getSex(),getOccupation(),getAge());
}*/
}