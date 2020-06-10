public class Rectangle{
private int length;
private int width;
private int area;
private int perimeter;

public void setLength(int length){
	this.length = length;
}

public void setWidth(int width){
	this.width = width;
}

public int getLength(int length){
	return length;
}

public int getWidth(int width){
	return width;
}

public int calArea(){
	area = length * width;
	return area;
}


public int calPerim(){
	perimeter = 2*length + 2*width;
	return perimeter;
}

}