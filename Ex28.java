import java.util.Scanner;

public class Ex28 {

public static void main(String args[]){
System.out.print("Enter an integer :");
Scanner input1 = new Scanner(System.in);
int b = input1.nextInt();

System.out.print("Enter another integer :");
Scanner input2 = new Scanner(System.in);
int c = input2.nextInt();

int a = b * c;

System.out.printf("The product of b & c is %d", a);
//Use a comment to state that a program performs a sample payroll calculation.
input1.close();

}

}