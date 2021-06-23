// Program to display the files in a directory without the sub-directory

import java.io.*;

public class FilesOnlyDisplay {
  public static void main(String[] args){
    File f = new File("C:\\Semicolon\\Dev\\React");
    f.mkdir();
    String[] dirList = f.list();
    int count = 0;
    for(String n: dirList){
       File f1 = new File(f,n);
      if(f1.isFile()){
         count++;
      System.out.println(n);
     }
        
     } System.out.println("The total number of files without sub-directories: "+count);

  }
}
