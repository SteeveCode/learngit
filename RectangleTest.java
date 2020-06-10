import java.util.Scanner;

public class RectangleTest{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter length of rectangle");
int len = input.nextInt();
Rectangle recobj = new Rectangle();
recobj.setLength(len);

System.out.println("Enter width of rectangle");
int wid = input.nextInt();
recobj.setWidth(wid);

recobj.getLength(len);
recobj.getWidth(wid);

recobj.calArea();
recobj.calPerim();

System.out.printf("The area is %d%n", recobj.calArea());
System.out.printf("The perimeter is %d%n", recobj.calPerim());






}
}