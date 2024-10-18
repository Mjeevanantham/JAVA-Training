package CollectorsClass;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + joinedNames);
    }

}
