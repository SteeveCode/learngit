
public class StaticVar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Family family = new Family("Seun", 25, "Agbomola");
		System.out.println(family.getFname());
		System.out.println(Family.getLname());
		System.out.println(family.getAge());
		System.out.println();

	}

}


class Family{
	
	String fname;
	public String getFname() {
		return fname;
	}
	public static String getLname() {
		return lname;
	}
	public int getAge() {
		return age;
	}
	static String  lname;
	int age;
	public Family(String fname, int age, String lname) {
		this.fname = fname;
		this.age = age;
		Family.lname = lname;
			
	}
	
}

