import java.util.*;
import java.util.stream.*;

public class Pretty_Joiner {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("London", "Paris", "New York", "Tokyo", "Sydney");
        String joined = cities.stream()
            .collect(Collectors.joining(", "));
        System.out.println("Cities: " + joined);
    }
}
