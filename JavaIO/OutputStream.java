package JavaIO;
import java.io.FileOutputStream;

public class OutputStream {


    public static void main(String args[]) {

        String data = "Selenium with java";

        try {
            // FileOutputStream is a subclass of OutputStream
            //file path passed as parameter to the FileOutputStream constructor.
            FileOutputStream fos = new FileOutputStream("os.txt");

            // Converts the string into bytes
            byte[] db = data.getBytes();

            // Writes data to the output stream
            fos.write(db);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            fos.close();
        } 
        catch (Exception e) 
        {
          
            e.getStackTrace();
        }
    }
}