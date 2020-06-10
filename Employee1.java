public class Employee1{

private String fName;
private String lName;
private double mSalary;

public Employee1(String fName, String lName, double mSalary){
	this.fName = fName;
	this.lName = lName;
	if(mSalary > 0.0)
		this.mSalary = mSalary;
	}
public void setfName(String fName){
	this.fName = fName;	
}

public void setlName(String lName){
	this.lName = lName;	
	}

public void setmSalary(double mSalary){
	this.mSalary = mSalary;
	}

public String getfName(){
	return fName;
	}

public String getlName(){
	return lName;
	}

public double getmSalary(){
	return mSalary;
	}

public double yearlySalary(){
return mSalary * 12;
	}
public double yearlySalaryInc(){
	mSalary = mSalary + (mSalary*0.1);
	return mSalary * 12;
	}

}