import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Custom_Filter_Chain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deva", "Arya", "Arvind", "Beula", "Alen", "Anagha");

        // Predicate for names starting with "A"
        Predicate<String> startsWithA = name -> name.startsWith("A");

        // Predicate for names ending with "a"
        Predicate<String> endsWithA = name -> name.endsWith("a");

        // Combine both predicates with .and()
        names.stream()
             .filter(startsWithA.and(endsWithA))
             .forEach(System.out::println);
    }
}