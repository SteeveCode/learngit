
public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man = new Man("Tunde", 25);
		System.out.println("My name is "+ man.getName());
		System.out.println("My age is "+ man.getAge());
		
		// Tutorial program to teach keyword continue and break
		int j = 0;
		for(int i =1; i<=100; i++){
			
			if(i%5 != 0) {
				System.out.println("Skip to the next iteration" +1);
				continue;
			}
			
			
			System.out.println(i);
			System.out.println("Dont skip to the next iteration");
			
			j = j+ 1;
			
			if(j==11){
			break;
			}
			}
		//System.out.print(i);
	}

}


class Man{
	
	 private String name;
	 private int age;
	public Man(String name, int age) 
	{
		this.name=name;
		this.age =age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		
		return name;
	}
	
public int getAge() {
		
		return age;
		
		
	}
}