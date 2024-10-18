package FileHandling;

import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("fileWriteOutput.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
