
public class BasePlusCommissionEmployeeComposition {

	private CommissionEmployee commissionEmployee;
	private double baseSalary; // base salary per week
	
	
	public BasePlusCommissionEmployeeComposition(CommissionEmployee commissionEmployee, double baseSalary) {
		this.commissionEmployee = commissionEmployee;
		setBaseSalary(baseSalary);
	}
	
	// set base salary
	public void setBaseSalary( double salary )
	{
	if ( salary >= 0.0 )
	baseSalary = salary;
	else
	throw new IllegalArgumentException(
	"Base salary must be >= 0.0" );
	} // end method setBaseSalary

	public CommissionEmployee getCommissionEmployee() {
		return commissionEmployee;
	}

	public void setCommissionEmployee(CommissionEmployee commissionEmployee) {
		this.commissionEmployee = commissionEmployee;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double earnings()
	{
	return getBaseSalary() + commissionEmployee.earnings();
	} // end method earnings

	// return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString()
	{
	return String.format( "%s: %s %s \n%s%s\n%s: $%,.2f %s: $%,.2f %s: $%,.2f",
	"base-salaried commission employee", commissionEmployee.getFirstName(),commissionEmployee.getLastName(),
	"social security number: ",commissionEmployee.getSocialSecurityNumber(),"gross sales", 
	commissionEmployee.getGrossSales(),
	"commission rate", commissionEmployee.getCommissionRate(),
	"base salary", getBaseSalary() );
	} // end method toString
}// end class BasePlusCommissionEmployee
