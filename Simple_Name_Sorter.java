import java.util.Arrays;
import java.util.List;

public class Simple_Name_Sorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harish", "Raj", "Pavan", "Dhanush", "Deva");

        // Sort using lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));

        // Print sorted names
        names.forEach(System.out::println);
    }
}