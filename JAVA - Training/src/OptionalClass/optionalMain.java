package OptionalClass;

import java.util.Optional;

public class optionalMain {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(getName());
        name.ifPresentOrElse(
                value -> System.out.println("Name: " + value),
                () -> System.out.println("Name not available")
        );
    }

    private static String getName() {
        // Simulate a null return
        return null;
    }
}
