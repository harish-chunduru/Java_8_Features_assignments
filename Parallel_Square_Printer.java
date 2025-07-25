
import java.util.Arrays;
import java.util.List;

public class Parallel_Square_Printer {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Using parallel stream to print squares concurrently
        numbers.parallelStream().forEach(n -> 
            System.out.println("Square of " + n + " is " + (n * n)
                + " — " + Thread.currentThread().getName())
        );
    }
}