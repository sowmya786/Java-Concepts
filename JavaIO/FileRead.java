package JavaIO;

import java.io.FileReader;

public class FileRead
{
 public static void main(String[] args) {

     try {
        
         FileReader fr = new FileReader("D:\\Java programs\\Programs\\JavaIO\\FileReader");

         int i;
         
         //If the read() method returns -1, there is no more data to read in the FileReader
         while ((i = fr.read()) != -1) {
             //reads all characters one char at a time from the FileReader.
             System.out.print((char) i);
         }
         //closing FileReader
         fr.close();

     } catch (Exception e) {
        
         e.printStackTrace();
     }
 }
}
