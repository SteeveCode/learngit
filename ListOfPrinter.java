import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

public class ListOfPrinter {

	public static void main(String[] args) {
		BufferedWriter writer = null;
		 
		 String printerNames = "";
		 printerNames += getPrinterNames();
		 try {
		  writer = new BufferedWriter(new FileWriter("printer.txt"));
		  writer.write(printerNames);
		  
		  System.out.println("Done!");
		 } catch (IOException e) {
		  e.printStackTrace();
		 } finally {
		  try {
		   if(writer != null) {
		    writer.close();
		   }
		  } catch (Exception ex) {
		   ex.printStackTrace();
		  }
		 }

	}
	
	private static String getPrinterNames() {
		 String content = "";
		 PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		 
		 content += "Number of print services: " + services.length;
		 content += "\n";
		 
		 if(services.length != 0 || services != null) {
		  int i = 1;
		  for(PrintService service : services) {
		   String name = service.getName();
		   
		   content += "Printer " + i + " name: " + name;
		   content += "\n";
		   i++;
		  }
		 }
		 
		 System.out.println(content);
		 
		 return content;
		}

}
