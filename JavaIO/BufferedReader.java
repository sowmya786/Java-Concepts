package JavaIO;

import java.io.FileReader;

public class BufferedReader {
	

    public static void main(String args[]) {

        try 
        {
            // Creates a FileReader
            //file path passed as parameter to the FileReader constructor.
            FileReader fr = new FileReader("D:\\Java programs\\Programs\\JavaIO\\BufferedReader");
            // Creates a BufferedReader
            java.io.BufferedReader br = new java.io.BufferedReader(fr);
            int i;
            // If the read() method returns -1, there is no more data to read in the FileReader
            while ((i = br.read()) != -1) 
            {
                //reads all characters one char at a time from the FileReader.
                System.out.print((char) i);
            }
            //closing FileWriter and BufferedWriter
            br.close();
            fr.close();
        } 
        catch (Exception e)
        {
        e.printStackTrace(); 
    }
}

}
           

