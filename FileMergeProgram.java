// Write a program to merge data from two files into a third file.

import java.io.*;

public class FileMergeProgram{
  public static void main(String[] args)throws IOException{
    PrintWriter pw = new PrintWriter("fileMerge.txt");
    BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
    String line = br.readLine();
    while(line != null){
      pw.println(line);
      line = br.readLine();
    }
    br = new BufferedReader(new FileReader("efg.txt"));
    line = br.readLine();
    while(line != null){
      pw.println(line);
      line = br.readLine();
    }
    pw.flush();
    br.close();
    pw.close();
  }
}