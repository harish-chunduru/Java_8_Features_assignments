import java.util.*;

public class Word_Counter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John Wick", "Amardeep", "Rajendra Prasad", "Bobby", "Alexandra", "Surya");
        long count = names.stream()
            .filter(name -> name.length() > 5)
            .count();
        System.out.println("Number of names longer than 5 characters: " + count);
    }
}
