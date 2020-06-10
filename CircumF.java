public class CircumF{

private double radius;
private double PI = 3.14;
private double result;

public void setRad(double radius){
	this.radius=radius;
}
public double getCircumF(){
	result = 2*PI*radius;
	return result;	
}

}