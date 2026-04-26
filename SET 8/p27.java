import java.io.*;
public class p27 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter("students.txt");

            fw.write("101 abc 85\n");
            fw.write("102 pqr 78\n");
            fw.write("103 xyz 92\n");

            System.out.println("Data written to file successfully.\n");
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } 
        finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } 
            catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}