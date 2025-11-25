package JavaIO;
import java.io.*;

public class BufferedOutputStream {


    public static void main(String[] args) 
    {
        String s = "Selenium with java";

        try
        {
            // BufferedOutputStream is a subclass of OutputStream
            //file path passed as parameter to the FileOutputStream constructor.
            FileOutputStream fos = new FileOutputStream("D:\\Java programs\\Programs\\JavaIO\\BufferedOutputStream");
     
            java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(fos);

            byte[] arr = s.getBytes();
           
            bos.write(arr);
            //closing streams
            bos.close();
            fos.close();
            System.out.println("Data is written to the file.");

        } 
        catch (Exception e) 
        {
            
            e.printStackTrace();
        }
    }
}