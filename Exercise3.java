import java.util.Scanner;

public class Exercise3 {
	public static void main(String...args){
	System.out.println("Enter your name");
	Scanner input = new Scanner(System.in);
	String name = input.next();
	System.out.println("Enter first number");
	int num1 = input.nextInt();
	System.out.println("Enter second number");
	int num2 = input.nextInt();
	int result = num1 + num2;
	System.out.printf("%s, the result of %d and %d is %d", name, num1, num2, result);
	input.close();
}
}
	
	
