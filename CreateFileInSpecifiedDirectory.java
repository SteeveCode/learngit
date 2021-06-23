import java.io.*;

public class CreateFileInSpecifiedDirectory{
	public static void main(String[] arg)throws IOException{
	File f = new File("Test Folder","FileTest1.txt");
	f.createNewFile();	
	}
}