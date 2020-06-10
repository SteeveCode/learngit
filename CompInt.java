import java.util.Scanner;

public class CompInt {

public static void main(String...args){
Scanner input = new Scanner(System.in);
System.out.println("Enter amount: ");
Double invst = input.nextDouble();
System.out.println("Enter interest rate: ");
Double intrst = input.nextDouble();
System.out.println("Enter number of years: ");
int years = input.nextInt();
Double amnt = invst * Math.pow(1+intrst,years);
System.out.printf("The compound interest after %d years is %f", years,amnt);

}


}