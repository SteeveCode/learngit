import java.util.Scanner;

public class CompNum {

public static void main(String...args){
Scanner input = new Scanner(System.in);
System.out.println("Enter first number: ");
int fnum = input.nextInt();
System.out.println("Enter second number: ");
int snum = input.nextInt();
if(fnum>snum){
System.out.printf("%d is greater than %d", fnum,snum);
}
if(fnum<snum){
System.out.printf("%d is less than %d", fnum,snum);
}
if(fnum==snum){
System.out.printf("%d is equal to %d", fnum,snum);
}
}

}