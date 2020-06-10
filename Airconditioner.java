//This code was submitted by Patience for debugging
public class Airconditioner{
	private String name;
	private String color;
	private int temperature;
	private double width;
	private float capacity;

//constructors

public Airconditioner(String name, String color){
	this.name = name;
	this.color = color;
	}
public Airconditioner(int temperature){
	this.temperature = temperature;
	}
public Airconditioner(double width){
	this.width = width;
	}
public Airconditioner(float capacity){
	this.capacity = capacity;
	}
//setters
public void setName(String name){
	this.name = name;
	 }
public void setColor(String color){
	this.color = color;
	}
public void setTemperature(int temperature){
	this.temperature = temperature;
	}
public void setWidth(double width){
	this.width = width;
	}
public void setCapacity(float capacity){
	this.capacity = capacity;
	}

//getter

public String getName (){
	return name;
	}
public String getColor (){
	return color;
	}
public int getTemperature (){
	return temperature;
	}
public double getWidth (){
	return width;
	}
public float getCapacity (){
	return capacity;
	}
public int TempIncrease(){
	int TempIncrease = temperature + 4;
	return TempIncrease;
	}	

}