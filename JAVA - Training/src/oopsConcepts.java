import java.util.Objects;
import java.util.Scanner;

class CommonClass {
    String Company = "Aaludra technology Solution";
    String Area = "Saravanampatti";
}

public class oopsConcepts extends CommonClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Are you above 18: ");
        String isAdult = scanner.nextLine();
        if (Objects.equals(isAdult, "no") || Objects.isNull(firstName) || Objects.isNull(lastName)) {
            System.out.println("Sorry, you are restricted.");
            System.exit(400);
        }
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        oopsConcepts obj = new oopsConcepts();

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Password: " + password);
        System.out.println("Company: " + obj.Company);
        System.out.println("Area: " + obj.Area);
    }
}
