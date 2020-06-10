// Exercises Question 8.4 - Solution

public class RectangleEx84Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleEx84 recObject1 = new RectangleEx84();
		System.out.println(recObject1.getLength());
		System.out.println(recObject1.getWidth());
		RectangleEx84 recObject2 = new RectangleEx84(4.0,3.5);
		System.out.println(recObject2.getLength());
		System.out.println(recObject2.getWidth());
		

	}

}

class RectangleEx84{
		private double length;
		private double width;
		
	
	RectangleEx84(){
		this.length=1;
		this.width =1;
	}
	
	
	RectangleEx84(double length){
		setDimension(length,0);
		
		
	}
	
	
	RectangleEx84(double length, double width){
		setDimension(length,width);
		
		
	}
	
	public void setDimension(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	public void setLength(double length){
		if(length > 0.0 && length <20.0)
		this.length = length;
		else 
			throw new IllegalArgumentException("Length entered is out of range");
	}
	
	public void setWidth(double width){
		if(width > 0.0 && width <20.0)
		this.width = width;
		else 
			throw new IllegalArgumentException("Length entered is out of range");
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
}