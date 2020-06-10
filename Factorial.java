import java.util.Scanner;
public class Factorial{

public static void main(String []args){
System.out.println("Enter a number: ");
Scanner input = new Scanner(System.in);
int fac = input.nextInt();
int result =1;

for(int i=1; i<=fac; i++){
	result = result *i;
}
System.out.println("The factorial of "+fac+" is "+result);
input.close();
}
}