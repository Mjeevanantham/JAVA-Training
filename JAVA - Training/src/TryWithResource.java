import java.io.*;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

//            readFileAsText();
//            readFileAsObj();
//            writeFileInTxt(scanner);
            writeFileInObj(scanner);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileAsText() throws IOException {
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void readFileAsObj() throws IOException {
        try (Scanner scanner = new Scanner(new File("InputData.json"))) {

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }


    public static void writeFileInTxt(Scanner scanner) throws IOException {
        try (FileWriter fileDate = new FileWriter("test.txt")) {

            System.out.println("Enter Your Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Your Age: ");
            int age = scanner.nextInt();
            System.out.println("Enter Your Role: ");
            String role = scanner.next();
            fileDate.write("Name: " + name + "\n");
            fileDate.write("Age: " + age + "\n");
            fileDate.write("Role: " + role + "\n");
            fileDate.write("Character: " + "Good Boy" + "\n");
        }
    }

    public static void writeFileInObj(Scanner scanner) throws IOException {
        try (FileWriter fileDate = new FileWriter("test.json")) {

            System.out.println("Enter Your Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Your Age: ");
            int age = scanner.nextInt();
            System.out.println("Enter Your Role: ");
            String role = scanner.next();
            User user = new User(name, age, role);
//            String user = "{\n" +
//                    "    \"id\": 1,\n" +
//                    "    \"name\": \"" + name + "\",\n" +
//                    "    \"age\": " + age + ",\n" +
//                    "    \"role\": \"" + role + "\",\n" +
//                    "}\n";
            fileDate.write(user.toString());
        }
    }
}
