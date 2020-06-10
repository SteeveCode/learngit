import java.io.*;

public class CircleTest{

public static void main(String [] args) throws Exception {// handles error if no data is entered
System.out.println("Enter radius");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String input = br.readLine();
double radius = Double.parseDouble(input);
double pi=3.14;
double area = pi*radius*radius;
System.out.println("The area of a circle with radius "+radius+" is "+area);
}
}