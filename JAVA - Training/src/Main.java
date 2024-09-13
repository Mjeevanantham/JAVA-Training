import java.util.Scanner;

// A simple class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to check eligibility for work based on age
    public void checkEligibility() {
        if (age >= 18) {
            System.out.println(name + " is eligible to work.");
        } else {
            System.out.println(name + " is not eligible to work.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);
        person.checkEligibility();

        double height;
        boolean isStudent;

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        height = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.println(name + " is " + height + " meters tall.");
        if (isStudent) {
            System.out.println(name + " is a student.");
        } else {
            System.out.println(name + " is not a student.");
        }

        // Array
        int[] numbers = {10, 20, 30, 40, 50};

        // If-else
        if (age < 18) {
            System.out.println("You are younger than 18");
        } else if (age >= 18 && age < 25) {
            System.out.println("You are between 18 and 25");
        } else {
            System.out.println("You are older than 25");
        }

        // Switch statement
        switch (age) {
            case 18:
                System.out.println("You just became an adult!");
                break;
            case 21:
                System.out.println("You are now 21 🙌🏼");
                break;
            case 22:
                System.out.println("You are now 22 🙌🏼");
                break;
            default:
                System.out.println("Age is just a number!");
                break;
        }

        // For-loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // While-loop
        int count = 0;
        System.out.println("Counting using while loop:");
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // For-each loop
        System.out.println("Array elements using for-each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Calling a method to find the largest number in an array
        System.out.println("The largest number in the array is: " + findLargest(numbers));

        // Closing the scanner
        scanner.close();
    }

    // Method to find the largest number in an array
    public static int findLargest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
