/**
 *
 * @author Akmal N.F
 */
public class Exception7 {
    public static void main(String[] args) {
        try {
            // Manually throw a new Exception with a custom message
            throw new Exception("Here's my Exception");
        } catch (Exception e) {
            // Catch the thrown Exception and print details
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage()); // Print the exception message
            System.out.println("e.toString(): " + e.toString()); // Print the exception type and message
            System.out.println("e.printStackTrace():"); // Print the stack trace
            e.printStackTrace();
        }
    }
}
