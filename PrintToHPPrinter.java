import java.io.*;
	
import java.net.*;
	
public class PrintToHPPrinter {

	
	
	     public static void main (String argv[]) throws Exception
	 {
	           // The line below illustrates the default port 6101 for mobile printers 9100 is the default port number
	    // for desktop and tabletop printers
	    Socket clientSocket=new Socket("172.16.0.88",9100);

	    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream() );
	           //The data being sent in the lines below illustrate CPCL  one can change the data for the corresponding 
	           //language being used (ZPL, EPL)   
	  
	    outToServer.writeBytes("Testing Gadans print assignment");
	           outToServer.writeBytes("This assignment was given by Chief");

	 

	    clientSocket.close();
	 }
	}


