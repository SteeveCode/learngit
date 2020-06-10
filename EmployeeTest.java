public class EmployeeTest{

public static void main(String []args){

Employee1 emp1 = new Employee1("Stephen", "Esebre", -250000.00);
Employee1 emp2 = new Employee1("Peter", "Enumah", 150000.00);
System.out.printf("The first employee's salary is: %.2f %n", emp1.yearlySalary());
System.out.printf("The second employee's salary is: %.2f %n", emp2.yearlySalary());
System.out.printf("The first employee's salary increase is: %.2f %n", emp1.yearlySalaryInc());
System.out.printf("The second employee's salary is: %.2f %n", emp2.yearlySalaryInc());
System.out.printf("Employee firstname is: "+ emp1.getfName());

}

}