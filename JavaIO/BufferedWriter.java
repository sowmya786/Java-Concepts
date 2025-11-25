package JavaIO;
import java.io.FileWriter;


public class BufferedWriter {


    public static void main(String[] args) {

        String s = "Selenium with java";

        try {
            // Creates a FileWriter
            //file path passed as parameter to the FileWriter constructor.
            FileWriter fw = new FileWriter("bw.txt");
            // Creates a BufferedWriter
            java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);

            //provides method to write string directly.
            bw.write(s);
            //closing FileWriter and BufferedWriter
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } 
        catch (Exception e) 
        {
            
            e.printStackTrace();
        }
    }
}