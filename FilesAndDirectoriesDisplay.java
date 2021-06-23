// Program to display both the files in a directory and the sub-directory

import java.io.*;

public class FilesAndDirectoriesDisplay{
  public static void main(String[] args) throws Exception{
    File f = new File("C:\\Program Files");
    f.mkdir();
    String[] dirString = f.list();
   // int count = 0;
    for(String n: dirString){
     //  count++;
       System.out.println(n);
    }
    
  }
}
