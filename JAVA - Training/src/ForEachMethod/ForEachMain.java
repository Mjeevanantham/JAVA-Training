package ForEachMethod;

import java.util.List;
import java.util.Arrays;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        items.forEach(item -> System.out.println("Item: " + item));
    }

}
