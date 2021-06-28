import java.io.*;

public class FileWriterDemo{
	public static void main(String[] args) throws IOException{
	FileWriter fw = new FileWriter("abc.txt", true); // where "true" is for append operation.
	fw.write('a'); // adding a single character
	fw.append("Durga\nSoftwateSolution"); // method append() can replace method write().
	fw.write('\n');
	char[] ch1 = {'a','b','c'};
	fw.write(ch1);
	fw.write('\n');
	fw.flush();// you must use the flush() method for it to write to file.
	fw.close();
}	

}