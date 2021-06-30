// program to remove duplicates from the given input file.

import java.io.*;

public class FileRemoveDuplicates{
    public static void main(String[] args) throws IOException{
        // creates a writer object as well as the output file (filesWithoutDuplicates.txt) if it doesn't already exist.
        PrintWriter pw = new PrintWriter("filesWithoutDuplicates.txt");

        // creates a reader object to read input file "fileWithDuplicates.txt"
        BufferedReader br1 = new BufferedReader(new FileReader("fileWithDuplicates.txt"));

        // does the actual reading of the first line and stores into a string variable 'readLine1'
        String readLine1 = br1.readLine();

        // the operations below is repetitive hence the reason for placing in a while loop
        while(readLine1 != null){
            boolean isPresent = false; // used to note a duplicate has been found

           // creates a reader object ready to read the newly created blank file
            BufferedReader br2 = new BufferedReader(new FileReader("filesWithoutDuplicates.txt"));

            // reads the newly created output file which is blank initially hence returns null to variable readLine2
            String readLine2 = br2.readLine();
            while(readLine2 != null){
                // checks if duplicates is are present in the input and output file
                if(readLine1.equals(readLine2)){
                    isPresent = true;
                    break;
                }
                // if no duplicate is found, reassign the next line and continue the loop
                readLine2 = br2.readLine();
            }
            // confirms no duplicate was found during a particular iteration and writes to files
            if(isPresent == false){
                pw.println(readLine1);
                pw.flush();
            }
            //
            // reassign the next line and continue the loop
            readLine1 = br1.readLine();
        }
    }
}
