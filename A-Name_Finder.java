import java.util.*;
import java.util.stream.*;

public class A_Name_Finder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Brian", "Ava", "Charlie");
        List<String> aNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + aNames);
    }
}
