import java.io.*;

public class PrintWriterDemo{
  public static void main(String[] args) throws IOException{
  FileWriter fw = new FileWriter("efg.txt");
  PrintWriter out = new PrintWriter(fw);
  out.write(100); // argument is unicode integer hence character 'd' is written.
  out.println(100); //argument is int data type
  out.println(true);
  out.println('c');
  out.println("Durga");
  out.flush();
  out.close();
}

}


