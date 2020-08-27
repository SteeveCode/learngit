// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
// This code has been modified to include the answer to the question in chapter 9 Exercise 9.3 (Using Composition Rather Than Inheritance)
public class PayrollSystemTest
{
public static void main( String[] args )
{
// create subclass objects
SalariedEmployee salariedEmployee =
new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );

HourlyEmployee hourlyEmployee =
new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );

CommissionEmployee commissionEmployee =
new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06 );

BasePlusCommissionEmployee basePlusCommissionEmployee =
new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300 );


BasePlusCommissionEmployeeComposition basePlusCommissionEmployeeComposition =
new BasePlusCommissionEmployeeComposition(commissionEmployee, 300 );

System.out.println( "Employees processed individually:\n" );

System.out.printf( "%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings() );

System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings() );

System.out.printf( "%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings() );

System.out.printf( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,
"earned", basePlusCommissionEmployee.earnings() );

System.out.println("***BasePlusCommissionEmployee using composition instead of inheritance***");

System.out.printf( "\n%s\n%s: $%,.2f\n\n", basePlusCommissionEmployeeComposition,
"earned", basePlusCommissionEmployeeComposition.earnings() );

// create four-element Employee array
Employee[] employees = new Employee[ 4 ];
// initialize array with Employees
employees[ 0 ] = salariedEmployee;
employees[ 1 ] = hourlyEmployee;
employees[ 2 ] = commissionEmployee;
employees[ 3 ] = basePlusCommissionEmployee;


System.out.println( "Employees processed polymorphically:\n" );

// generically process each element in array employees
for ( Employee currentEmployee : employees )
{
System.out.println(currentEmployee); // invokes toString

// determine whether element is a BasePlusCommissionEmployee
if (currentEmployee instanceof BasePlusCommissionEmployee)
{
// downcast Employee reference to BasePlusCommissionEmployee reference
BasePlusCommissionEmployee employee =
( BasePlusCommissionEmployee ) currentEmployee;

employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

System.out.printf(
"new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
} // end if

System.out.printf("earned $%,.2f\n\n",currentEmployee.earnings() );
} // end for

System.out.println(basePlusCommissionEmployeeComposition);
basePlusCommissionEmployeeComposition.setBaseSalary( 1.10 * basePlusCommissionEmployeeComposition.getBaseSalary());
System.out.printf(
"new base salary with 10%% increase is: $%,.2f\n", basePlusCommissionEmployeeComposition.getBaseSalary());
System.out.printf("earned $%,.2f\n\n",basePlusCommissionEmployeeComposition.earnings() );
System.out.println();

// get type name of each object in employees array
for ( int j = 0; j < employees.length; j++ )
System.out.printf( "Employee %d is a %s\n", j,
employees[ j ].getClass().getName() );
System.out.printf( "Employee %d is a %s\n",4,"basePlusCommissionEmployeeComposition");
} // end main
} // end class PayrollSystemTest