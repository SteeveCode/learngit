public class Student{
 private String firstName;
 private String lastName;
 private int level;
 private double grade;

  public void setfirstName(String firstName){
	this.firstName = firstName;
	}

 public void setlastName(String lastName){
	this.lastName = lastName;
	}

public void setlevel(int level){
	this.level = level;
	}

public void setgrade(double grade){
	this.grade = grade;
	}

public String getfirstName(){
	return firstName;
	}

public String getlastName(){
	return lastName;
	}

public int getlevel(){
	return level;
	}
public double getgrade(){
	return grade;
	}
	public void promotion(double grade){
	
	if(grade > 3.5){
		System.out.println("promoted to next level");	
	}
	else{
		System.out.println("repeat class");
	}

	}
}