import java.util.Scanner;
public class StudentTest{
 public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first name");
	 String name= input.next();
	System.out.println("Enter last name");
	String name2 = input.next();
	System.out.println("Enter level");
	int level = input.nextInt();
	System.out.println("Enter grade");
	double grade = input.nextDouble();
	Student stuObj = new Student();
	stuObj.setfirstName(name);
	stuObj.getfirstName();
	stuObj.setlastName(name2);
	stuObj.getlastName();
	stuObj.setlevel(level);
	stuObj.getlevel();
	stuObj.setgrade(grade);
	stuObj.getgrade();

	stuObj.promotion(grade);
	

	






}


}