import java.io.*;

public class CreateFileInCurrentDirectory{
	public static void main(String[] arg)throws IOException{
	File f = new File("FileTest.txt");
	f.createNewFile();	
	}
}