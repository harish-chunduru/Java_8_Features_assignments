import java.util.*;

public class Method_Reference_Sorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Bob", "Alice", "David", "Eve");
        names.sort(String::compareTo);
        System.out.println("Sorted names: " + names);
    }
}
