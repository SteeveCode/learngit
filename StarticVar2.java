// this code explores static variables and how it is likely to be used.
public class StarticVar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest staticObj = new StaticTest("Benson",29);
		StaticTest staticObj2 = new StaticTest("John",39);
		StaticTest staticObj3 = new StaticTest("Kelly",49);
		
		System.out.printf("%-10s%-10s%-12s%-8s\n", "SURNAME", "FIRSTNAME", "SCHOOL","AGE");
		System.out.printf("%-10s%-10s%-12s%-8d\n",StaticTest.surName,staticObj.firstName,StaticTest.school,staticObj.age);
		System.out.printf("%-10s%-10s%-12s%-6d\n",StaticTest.surName,staticObj2.firstName,StaticTest.school,staticObj2.age);
		System.out.printf("%-10s%-10s%-12s%-6d\n",StaticTest.surName,staticObj3.firstName,StaticTest.school,staticObj3.age);

	}

}

class StaticTest{
	public static String surName = "Carson";
	public String firstName;
	public static String  school = "Harvard";
	public int age;
	
	public StaticTest(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
}