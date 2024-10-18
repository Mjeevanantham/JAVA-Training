package FileHandling;

import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("fileWriteOutput.txt"))) {
            bw.write("Hi there i am writing this to txt file....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
