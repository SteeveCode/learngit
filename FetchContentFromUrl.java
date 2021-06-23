/*
 * Program that fetches the information stored at a given URL on the web and saves that data to a file.
 * */

import java.io.*;
import java.net.*;

public class FetchContentFromUrl {
    public static void main(String[] args)throws Exception
    {
        try{
            String urlAddress = "https://cnn.com";
            URL url = new URL(urlAddress);
            String outPutFile = "cnn.txt";
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(outPutFile);
            copyStream(is,os);
        } catch(MalformedURLException e){
            e.printStackTrace();
            throw new MalformedURLException("URL is malformed! Ensure the URL is correct!");
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new IOException("an IOException was encountered!!!");
        }
    }
    static void copyStream(InputStream input, OutputStream output)
            throws IOException {
        try {
            int oneByte = input.read();
            while (oneByte >= 0) { // negative value indicates end-of-stream
                output.write(oneByte);
                oneByte = input.read();
            }
        }
        finally {
            try { if (input != null) input.close();
            } catch(IOException e) {
            e.printStackTrace();
            }
                try { if (output != null) output.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
        }
        }

    }


