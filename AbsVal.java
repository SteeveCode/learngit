import java.util.Scanner;

public class AbsVal{

public static void main(String...args){
try (Scanner input = new Scanner(System.in)) {
	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();
	int absolute1 = Math.abs(num1-num2);
	int absolute2 = Math.abs(num2-num1);
	System.out.printf("The absolute value of %d & %d is: %d %n", num1,num2,absolute1);
	System.out.printf("The absolute value of %d & %d is: %d %n", num2,num1,absolute2);
}
}
}