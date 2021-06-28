import java.io.*;

public class FileReaderDemo{
  public static void main(String[] args) throws IOException{

// read file using an array of characters

  File f = new File("abc.txt"); // creates the file object.
  char[] ch = new char[(int)f.length()]; // returns Long value of the number of characters in the file. char array takes on type int hence the type casting.
  FileReader fr = new FileReader(f); // reads the content of the file
  fr.read(ch); // pastes content of the file to the character array.
  for(char ch1:ch){System.out.print(ch1);} // iterates through the array and prints out each character.
  System.out.println();

// read file using a single characters

  File f1 = new File("abc.txt");
  FileReader fr1 = new FileReader(f);
  int i = fr1.read();
  while(i != -1){
  System.out.print((char)i);
  i = fr1.read();

  //void close();
  
}

}

}