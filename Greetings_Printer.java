// Functional interface with one method
@FunctionalInterface
interface MessagePrinter {
    void print(String message);
}

public class Greetings_Printer {
    // Method that accepts a MessagePrinter and a message
    public static void greet(String message, MessagePrinter printer) {
        printer.print(message);
    }

    public static void main(String[] args) {
        // Pass a lambda as the message printer
        greet("Hello from Java 8 Functional Interface!", msg -> System.out.println(msg));
    }
}
