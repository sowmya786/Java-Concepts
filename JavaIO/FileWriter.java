package JavaIO;

// FileWriter class is used to write character-oriented data to a file.
public class FileWriter {
    public static void main(String[] args) {

        String s = "written using FileWriter.";

        try {
            
            java.io.FileWriter fw = new java.io.FileWriter("D:\\Java programs\\Programs\\JavaIO\\Filewriter");

            //provides method to write string directly.
            fw.write(s);
            
            //closing FileWriter
            fw.close();
            
            System.out.println("Data is written to the file.");

        } 
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }
}