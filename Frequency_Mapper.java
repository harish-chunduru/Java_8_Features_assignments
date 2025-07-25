import java.util.*;
import java.util.stream.*;

public class Frequency_Mapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harish", "Bobby", "Pavan", "Charan", "Bobby", "Rajendra", "Deva");
        Map<String, Long> frequencyMap = names.stream()
            .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println("Name frequencies: " + frequencyMap);
    }
}
    