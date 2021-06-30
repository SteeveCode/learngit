// program to perform file extraction operation. where extractOutput.txt = extractInput.txt - extractDelete.txt

import java.io.*;

public class FileExtraction{
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("extractOutput.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("extractInput.txt"));
        String line1 = br1.readLine();
        while(line1 != null){
            boolean isAvailable = false;
            BufferedReader br2 = new BufferedReader(new FileReader("extractDelete.txt"));
            String line2 = br2.readLine();
            while(line2 != null){
                if(line1.equals(line2)){
                    isAvailable = true;
                    break;
                }
                line2 = br2.readLine();
            }
            if(isAvailable == false){
                pw.println(line1);
            }
            line1 = br1.readLine();
        }
        pw.flush();
    }
}