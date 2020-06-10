// This code is to demonstrate static variables & methods
public class StaticEmpire {

	public static void main(String[] args) {
		Empire country1 = new Empire("Nigeria","Oil","Naira", 200000000);
		Empire country2 = new Empire("South Africa","Technology","Rand", 100000000);
		Empire country3 = new Empire("Ghana","Gold","Cedis", 50000000);
		System.out.println(country1);
		System.out.println(Empire.getContinent());
		System.out.println();
		System.out.println(country2);
		System.out.println(Empire.getContinent());
		System.out.println();
		System.out.println(Empire.getContinent());
		System.out.println(country3);
		System.out.println();
		System.out.println(country3.findContinent()); //non-static method accessing static variable(This is wrong though it runs)
		System.out.println();
		System.out.println(country1.getContinent());//referencing a static method using the object of a class(This is wrong though it runs)
		
	
	}
}

class Empire{
	

	// TODO Auto-generated method stub
	
	private static String continent = "Africa";
	private String country;
	private String naturalResource;
	private String currency;
	private int population;
	public Empire(String country, String naturalResource, String currency, int population) {
		super();
		this.country = country;
		this.naturalResource = naturalResource;
		this.currency = currency;
		this.population = population;
	}
	public static String getContinent() {
		return continent;
	}
	public static void setContinent(String continent) {
		Empire.continent = continent;
	}
	
	public String findContinent() {
		return continent; // non-static method can reference static variable, static method & instance variable.
	}
	public String checkContinent() {
		return getContinent(); // non-static method can reference static variable, static method & instance variable.
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNaturalResource() {
		return naturalResource;
	}
	public void setNaturalResource(String naturalResource) {
		this.naturalResource = naturalResource;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String toString() {
		
		return String.format("%s\n%s\n%s\n%,d",country,naturalResource,currency,population);
	}
	
}