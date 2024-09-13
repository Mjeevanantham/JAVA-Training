import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class sample {

    public static void main(String[] args) {
        // Replace with the path to your file
        String filePath = "D:/Downloads/test.txt";

        try {
            String format = determineFileFormat(filePath);
            System.out.println("The format of the file is: " + format);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to determine the file format based on extension and content
    public static String determineFileFormat(String filePath) throws IOException {
        File file = new File(filePath);

        // Check if file exists
        if (!file.exists()) {
            return "File does not exist.";
        }

        // Get file extension
        String extension = getFileExtension(file);

        // Determine format based on the extension
        switch (extension.toLowerCase()) {
            case "txt":
                return "Text File";
            case "jpg":
            case "jpeg":
                return "JPEG Image";
            case "png":
                return "PNG Image";
            case "pdf":
                return "PDF Document";
            case "mp3":
                return "MP3 Audio";
            case "mp4":
                return "MP4 Video";
            default:
                // Fallback to content-based detection
                return detectFormatByContent(file);
        }
    }

    // Helper method to get the file extension
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int lastIndex = fileName.lastIndexOf('.');
        if (lastIndex > 0 && lastIndex < fileName.length() - 1) {
            return fileName.substring(lastIndex + 1);
        }
        return "";
    }

    // Method to detect format by reading the file's magic numbers (first few bytes)
    private static String detectFormatByContent(File file) throws IOException {
        byte[] buffer = new byte[8];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(buffer, 0, buffer.length);
        }

        // Check magic numbers for common file types
        if (isPDF(buffer)) {
            return "PDF Document";
        } else if (isJPEG(buffer)) {
            return "JPEG Image";
        } else if (isPNG(buffer)) {
            return "PNG Image";
        } else {
            return "Unknown format";
        }
    }

    // Check if the file is a PDF based on magic numbers
    private static boolean isPDF(byte[] buffer) {
        return buffer[0] == 0x25 && buffer[1] == 0x50 && buffer[2] == 0x44 && buffer[3] == 0x46; // %PDF
    }

    // Check if the file is a JPEG based on magic numbers
    private static boolean isJPEG(byte[] buffer) {
        return buffer[0] == (byte) 0xFF && buffer[1] == (byte) 0xD8 && buffer[2] == (byte) 0xFF;
    }

    // Check if the file is a PNG based on magic numbers
    private static boolean isPNG(byte[] buffer) {
        return buffer[0] == (byte) 0x89 && buffer[1] == 0x50 && buffer[2] == 0x4E && buffer[3] == 0x47; // PNG
    }
}
