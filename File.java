import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // 1. Create and write to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file handling example in Java!\n");
            writer.write("We are writing multiple lines to the file.\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 2. Read from the file
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading from the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
