import java.util.EnumSet;

// Fig. 8.11: EnumTest.java
	// Testing enum type Book.
	

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(EnumBook.lib);
	
		System.out.println("All books in the "+EnumBook.lib+":");
		// print all books in enum Book
		for(EnumBook book : EnumBook.values()) 
			System.out.printf("%-10s%-45s%s%n", book,book.getTitle(), book.getCopyrightYear());
		
			
		System.out.printf("%nDisplay a range of enum constants:%n");
		
			// print first four books
		for (EnumBook book :EnumSet.range(EnumBook.JHTP, EnumBook.CPPHTP))
				System.out.printf("%-10s%-45s%s%n", book,book.getTitle(), book.getCopyrightYear());
		
		}
	
	}// end class EnumTest


