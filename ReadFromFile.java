import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		
		File file = new File("ReadMe");
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				String name = input.nextLine();
				System.out.println(name);
			}
		}
		catch(FileNotFoundException e) {
			System.err.format("File does not exist");
		}

	}

}
