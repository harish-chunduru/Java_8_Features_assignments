import java.util.Optional;

public class Safe_Divider {
    public static Optional<Double> divide(double numerator, double divisor) {
        if (divisor == 0) {
            return Optional.empty(); // Case when division isn't allowed
        }
        return Optional.of(numerator / divisor); // Safe division
    }

    public static void main(String[] args) {
        Optional<Double> result = divide(10, 2);
        result.ifPresentOrElse(
            val -> System.out.println("Result: " + val),
            () -> System.out.println("Not Allowed")
        );

        Optional<Double> resultZero = divide(10, 0);
        resultZero.ifPresentOrElse(
            val -> System.out.println("Result: " + val),
            () -> System.out.println("Not Allowed")
        );
    }
}