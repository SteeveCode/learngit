import java.util.Scanner;

public class CircumFTest{
public static void main(String...args){

System.out.println("Enter radius of the circle");
Scanner input = new Scanner(System.in);
Double rad = input.nextDouble();
CircumF circle = new CircumF();
circle.setRad(rad);
circle.getCircumF();
System.out.printf("The circumference of the circle is %f", circle.getCircumF());

}
}